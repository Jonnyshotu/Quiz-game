package Game

import Farben.*
import Questions.Quiz
import utilis.*
import kotlin.system.exitProcess

/**
 * Starts the quiz game.
 * Initializes the quiz questions, greets the player, waits for 2 seconds,
 * and prompts the player to choose the game mode (singleplayer or multiplayer).
 */
fun game () {
    Quiz.initialiseQuiz()
    greeting()
    Thread.sleep(2000)
    chooseGame()
}

/**
 * Prompts the player to choose the game mode.
 * Displays a menu with options for singleplayer, multiplayer, and viewing the champions' board.
 * Reads the player's choice and calls the corresponding function.
 * @see Quizmaster.singleplayer
 * @see Quizmaster.multiplayer
 * @see Quizmaster.showChampions
 */
fun chooseGame() {
    println(
        """
$BOLD                   Choose players$reset
                    
                    1. Singleplayer
                    2. 1 VS 1
                    3. Championsboard
                    
                    0. EXIT
                                       
$reset""".trimMargin()
    )
    when (readMenu(0..3)) {
        0 -> exitProcess(0)
        1 -> Quizmaster.singleplayer()
        2 -> Quizmaster.multiplayer()
        3 -> Quizmaster.showChampions()
    }
}

