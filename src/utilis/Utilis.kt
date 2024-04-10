package utilis

import Farben.*
import Game.Quizmaster
import Game.chooseGame
import Person.Player

/**
 * Reads the name and age of the player from the console.
 * Validates the age and prompts the player to enter a valid age if it's below 12.
 * @return the created Player object with the entered name and age
 */
fun initialisePlayer(): Player {

    print("${UNDERLINE}Enter your name:$reset ")
    val name: String = readln()
    println()

    print("${UNDERLINE}Enter your age:$reset ")
    val age: Int = readInt()
    println()

    if (age < 12) {
        println("${BOLD}${RED}You are too young for the quiz.$reset")
        return initialisePlayer()
    }
    return Player(name, age)
}

/**
 * Reads a text-based answer from the console.
 * @return the entered answer in lowercase
 */
fun readTextAnswer(): String {

    print("${UNDERLINE}Enter your answer:$reset ")

    val answer: String = readln()
    println()
    return answer.lowercase()
}

/**
 * Reads a multiple-choice answer from the console.
 * @return the index of the selected answer (0 for 'A', 1 for 'B', etc.)
 */
fun readMultipleAnswer(): Int {

    println()
    print("${UNDERLINE}Enter the letter of your answer:$reset ")

    val answer: Char = try {
        readln().lowercase().firstOrNull() ?: throw IllegalArgumentException()
    } catch (e: IllegalArgumentException) {
        ' '
    }
    println()
    return when (answer) {
        'a' -> 0
        'b' -> 1
        'c' -> 2
        'd' -> 3
        else -> {
            println("${RED}Invalid input. Please try again.$reset")
            readMultipleAnswer()
        }
    }
}

/**
 * Reads a true/false answer from the console.
 * Prompts the user to enter 'Y' for true and 'N' for false.
 * @return true if the answer is true, false otherwise
 */
fun readTrueOrFalse(): Boolean {

    println("${GREEN}${UNDERLINE}True$reset$ or ${RED}False?$reset$ (Y/N)$reset")

    println()
    return when (readChar()) {
        'y' -> true
        'n' -> false
        else -> {
            println("${RED}Invalid input. Please try again.$reset")
            readTrueOrFalse()
        }
    }
}

/**
 * Reads a menu item from the console.
 * Validates the input to ensure it falls within the specified menu range.
 * @param menuSize the range of valid menu items
 * @return the selected menu item
 */
fun readMenu(menuSize: IntRange): Int {

    print("${UNDERLINE}Enter a menu item:$reset ")

    val input = readln()
    println()
    try {
        val menuChoice: Int = input.toInt()
        if (menuChoice in menuSize) {
            return menuChoice
        } else {
            println("${RED}Invalid menu choice.$reset")
            return readMenu(menuSize)
        }
    } catch (e: NumberFormatException) {
        println("${RED}Invalid input. Please enter a valid menu item.$reset")
        return readMenu(menuSize)
    }
}

/**
 * Prints a welcome ASCII.
 */
fun greeting() {
    print(
        """${BLUE_BACKGROUND}$BOLD
                                88                     88                                
                                ""               ,d    ""                                
                                                 88                                      
                                               MM88MMM 88 88,dPYba,,adPYba,   ,adPPYba,  
                                                 88    88 88P'   "88"    "8a a8P_____88  
         ,adPPYb,d8 88       88 88 888888888     88    88 88      88      88 8PP8888888  
        a8"    `Y88 88       88 88      a8P"     88    88 88      88      88 8PP
        8b       88 88       88 88   ,d8P'       88,   88 88      88      88 "8b,   ,aa 
        "8a    ,d88 "8a,   ,a88 88 ,d8"          "Y888 88 88      88      88  `"Ybbd8"'
         `"YbbdP'88  `"YbbdP'Y8 88 888888888  
                 88                           
                 88    
                 
$reset""".trimIndent()
    )

}

/**
 * Reads an integer from the console.
 * Prompts the user to enter a valid number if the input is not a number.
 * @return the entered integer
 */
fun readInt(): Int {

    val input = readln()
    return try {
        input.toIntOrNull() ?: throw NumberFormatException()
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid number.")
        readInt()
    }
}

/**
 * Reads a single character from the console.
 * @return the entered character, or ' ' if no character is entered
 */
fun readChar(): Char {

    val answer: Char = try {
        readln().lowercase().firstOrNull() ?: throw IllegalArgumentException()
    } catch (e: IllegalArgumentException) {
        ' '
    }
    return answer
}

/**
 * Asks the player if they want to play again.
 * Prompts the user to enter 'Y' for yes and 'N' for no.
 * Calls the appropriate function based on the user's choice.
 */
fun playAgain() {

    println("Do you want to play again? (Y/N)")
    println()

    when (readChar()) {
        'y' -> Quizmaster.singleplayer()
        'n' -> chooseGame()
        else -> {
            println("${RED}Invalid input. Please try again.$reset")
            playAgain()
        }
    }
}

/**
 * Calculates the Levenshtein distance between two strings.
 * Used to measure the similarity between the correct answer and the user's input.
 * @param correctAnswer the correct answer string
 * @param input the user's input string
 * @return the Levenshtein distance between the two strings
 */
fun deviation(correctAnswer: String, input: String): Int {
    if (correctAnswer == input) return 0
    if (correctAnswer.isEmpty()) return input.length
    if (input.isEmpty()) return correctAnswer.length

    val calcArray: Array<IntArray> = Array(correctAnswer.length + 1) { IntArray(input.length + 1) }
    for (a in 0..correctAnswer.length) calcArray[a][0] = a
    for (b in 0..input.length) calcArray[0][b] = b

    for (a in 1..correctAnswer.length) {
        for (b in 1..input.length) {
            calcArray[a][b] = minOf(
                calcArray[a - 1][b] + 1,
                calcArray[a][b - 1] + 1,
                calcArray[a - 1][b - 1] + (if (correctAnswer[a - 1] == input[b - 1]) 0 else 1)
            )
        }
    }

    return calcArray[correctAnswer.length][input.length]
}