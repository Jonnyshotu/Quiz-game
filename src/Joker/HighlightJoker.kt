package Joker

import Farben.*
import Person.Player
/**
 * Represents the Highlight joker.
 */
class HighlightJoker : Joker {
    /**
     * Sets the Highlight joker for the player.
     * Removes the joker from the player's list of available jokers.
     * @param player the player who uses the joker
     * @return the Highlight joker
     */
    override fun setJoker(player: Player) : Joker {
        println("${BOLD}\t\tQuestion highlighted!$reset")
        println()
        player.jokers.remove(this)
        return this
    }
}