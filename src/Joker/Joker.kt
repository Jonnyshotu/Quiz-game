package Joker

import Person.Player
/**
 * Interface for defining Joker behavior.
 */
interface Joker {
    /**
     * Sets the Joker for the player.
     * @param player the player who uses the Joker
     * @return the Joker object
     */
    fun setJoker(player: Player): Joker
}


