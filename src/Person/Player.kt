package Person

import Farben.*
import Joker.*
import kotlin.reflect.KClass

/**
 * Represents a player participating in the quiz game.
 * Extends the Person class to inherit properties such as name and age.
 * Manages the player's jokers, rounds played, and points earned.
 * Provides functionality to display available jokers and choose a joker for a round.
 * @param name the name of the player
 * @param age the age of the player
 */
class Player(name: String, age: Int) : Person(name, age) {

    var jokers: MutableList<Joker> = mutableListOf(FiftyFiftyJoker(), HighlightJoker(), SkipJoker())    // List of jokers available to the player

    var roundsPlayed: Int = 0      // Number of rounds played by the player
    var points: Int = 0           // Total points earned by the player

    /**
     * Displays the available jokers for the player to use in the current round.
     * Excludes any jokers specified in the 'excludedJokerTypes' list.
     * @param excludedJokerTypes a list of joker types to exclude from the available options
     * @return a list of available jokers after filtering
     */
    fun showJoker(excludedJokerTypes: List<KClass<out Joker>>) : List<Joker> {
        val availableJokers = jokers.filter { joker ->
            joker::class !in excludedJokerTypes
        }

        if (availableJokers.isNotEmpty()) {
            println("\n${GREEN}Your available joker:$reset\n ")
            availableJokers.forEachIndexed { index, joker ->
                println("${index + 1}: ${joker::class.simpleName}")
            }
            println()
        } else {
            println("\n${RED}You have no available jokers.$reset\n")
        }
        return availableJokers
    }

    /**
     * Allows the player to choose a joker to use for the current round.
     * Displays the available jokers and prompts the player to select one.
     * @param roundJoker a list of jokers available for the current round
     * @return the chosen joker, or null if the player decides not to use a joker
     */
    fun chooseJoker(roundJoker: List<Joker>): Joker? {
        println("If you want to use a joker, type its number, otherwise press ENTER:")
        val input = readln()

        if (input.isBlank()) {
            println("${RED}No joker used$reset")
            return null
        }

        return try {
            val choice = input.toInt()
            if (choice in 1..roundJoker.size) {
                roundJoker[choice - 1].setJoker(this)
            } else {
                println("${RED}Invalid input. Please try again.$reset")
                chooseJoker(roundJoker)
            }
        } catch (e: NumberFormatException) {
            println("${RED}Invalid input. Please enter a valid number.$reset")
            chooseJoker(roundJoker)
        }
    }
}