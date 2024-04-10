package Joker

import Farben.BOLD
import Farben.reset
import Person.Player
/**
 * Represents the Skip Joker, which allows skipping a question in the quiz.
 */
class SkipJoker : Joker {
    /**
     * Sets the Skip Joker for the player, allowing them to skip a question.
     * @param player the player who uses the Skip Joker
     * @return the Skip Joker object
     */
    override fun setJoker(player: Player): Joker {
        println("${BOLD}\t\tQuestion skipped!$reset")
        println()
        player.jokers.remove(this)
        return this
    }
}