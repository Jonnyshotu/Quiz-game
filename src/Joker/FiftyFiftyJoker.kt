package Joker

import Farben.*
import Person.Player
/**
 * Represents the Fifty-Fifty joker.
 */
class FiftyFiftyJoker : Joker {
    /**
     * Sets the Fifty-Fifty joker for the player.
     * Removes the joker from the player's list of available jokers.
     * @param player the player who uses the joker
     * @return the Fifty-Fifty joker
     */
    override fun setJoker(player: Player) : Joker {
        println("${BOLD}\t\t50 : 50$reset")
        println()
        player.jokers.remove(this)
        return this
    }
}