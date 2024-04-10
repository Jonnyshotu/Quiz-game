package Game

import Farben.*
import Person.Player
import Questions.Quiz
import utilis.*


/**
 * Represents the Quizmaster, who manages the quiz game.
 * This class handles singleplayer, multiplayer, and displaying the champions' board.
 */
abstract class Quizmaster {

    /**
     * Represents the controller for managing the quiz game.
     * Provides functions for singleplayer, multiplayer modes, and displaying the champions' board.
     * Manages player information and game rounds.
     */
    companion object {
        var player1: Player = Player("", 0)     // Represents the first player in the game
        var player2: Player = Player("", 0)     // Represents the second player in the game


        var roundCounter: Int = 0        // Counter to keep track of the rounds played
        var championsBoard: MutableList<Pair<String, Int>> = mutableListOf()        // List to store the champions' board entries (player name and points)



        /**
         * Starts the singleplayer game mode.
         * Prompts the player to enter their name if it's blank.
         * Manages the game rounds and updates the champions' board.
         */
        fun singleplayer() {

            roundCounter = 0

            println("${UNDERLINE}Player 1:$reset ")

            if (player1.name.isBlank()){
                player1 = initialisePlayer()
            } else {
                println("${player1.name}\nNew Player? (Y/N)")
                when (readChar()) {
                    'y' -> player1 = initialisePlayer()
                    'n' -> Unit
                    else -> {
                        println("${RED}Invalid input. Please try again.$reset")
                        singleplayer()
                    }
                }
            }
            player1.points = 0

            while (roundCounter < 10) {
                gameRound(player1)
            }

            println()
            println("$BOLD$UNDERLINE${player1.name} got ${player1.points} points.$reset")

            player1.roundsPlayed++
            championsBoard.add(Pair(player1.name, player1.points))
            playAgain()
        }

        /**
         * Starts the multiplayer game mode.
         * Prompts both players to enter their names if they're blank.
         * Manages the game rounds for both players and updates the champions' board.
         */
        fun multiplayer() {

            roundCounter = 0

            println("${UNDERLINE}Player 1:$reset ")

            if (player1.name.isBlank()){
                player1 = initialisePlayer()
            } else {
                println("${player1.name}\nNew Player? (Y/N)")
                when (readChar()) {
                    'y' -> player1 = initialisePlayer()
                    'n' -> Unit
                    else -> {
                        println("${RED}Invalid input. Please try again.$reset")
                        multiplayer()
                    }
                }
            }
            player1.points = 0

            println("${UNDERLINE}Player 2:$reset ")
            if (player2.name.isBlank()){
                player2 = initialisePlayer()
            } else {
                println("${player2.name}\nNew Player? (Y/N)")
                when (readChar()) {
                    'y' -> player2 = initialisePlayer()
                    'n' -> Unit
                    else -> {
                        println("${RED}Invalid input. Please try again.$reset")
                        multiplayer()
                    }
                }
            }
            player2.points = 0

            while (roundCounter < 20) {
                gameRound(player1)
                gameRound(player2)
            }
            println()
            println("$BOLD$UNDERLINE${player1.name} got ${player1.points} points.$reset")
            println("$BOLD$UNDERLINE${player2.name} got ${player2.points} points.$reset")
            println()
            if (player1.points < player2.points) println(
                "$YELLOW_BACKGROUND$BOLD$BLACK${player2.name} won!$reset"
            )
            else if (player1.points == player2.points)
                println(
                    "Draw!"
                ) else println(
                "$YELLOW_BACKGROUND$BOLD$BLACK${player1.name} won!$reset"
            )
            player1.roundsPlayed++
            championsBoard.add(Pair(player1.name, player1.points))
            player2.roundsPlayed++
            championsBoard.add(Pair(player2.name, player2.points))
            playAgain()
        }

        /**
        * Displays the champions' board, showing players with the highest points.
        * Players are sorted by their points in descending order.
        */
        fun showChampions() {

            val sortedChampions = championsBoard.sortedByDescending { correctAnswers -> correctAnswers.second }

            println("$BOLD$YELLOW_BACKGROUND\t\tCHAMPIONSBOARD\t\t$reset")
            for ((index, entry) in sortedChampions.withIndex()) {
                val (name, correctAnswers) = entry
                println("${index + 1} $name with $correctAnswers points")
            }

            Thread.sleep(3000)
            println()
            chooseGame()
        }

        /**
         * Manages each round of the game for a given player.
         * Selects a random question, removes it from the list of available questions,
         * and prompts the player to answer it.
         * @param player The player for whom the round is managed.
         */
        private fun gameRound(player: Player) {

            Thread.sleep(1000)
            println()
            println("\t\t${BOLD}${player.name}´s turn.$reset")

            val question: Quiz = Quiz.allQuizes.random()
            println("$PURPLE_BACKGROUND$BLACK\t\t${question::class.simpleName}\t\t$reset")
            Quiz.allQuizes.remove(question)

            when ((1..3).random()) {
                1 -> question.textQuiz(player)
                2 -> question.multipleChoiceQuiz(player)
                3 -> question.trueOrFalseQuiz(player)
            }
            roundCounter++
        }
    }

}
