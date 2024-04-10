package Questions

import Farben.*
import Joker.*
import Person.Player
import utilis.*

/**
 * Represents all quiz questions with its correct answers and optional wrong answers.
 * Provides functionality for different types of quizzes such as text, multiple choice, and true/false.
 * Also includes methods for checking if an answer is correct and printing quiz questions.
 * @param questions the text of the question
 * @param answer the correct answer to the question
 * @param wrongAnswer wrong answers for multiple choice questions
 */
abstract class Quiz(private val questions: String, private val answer: String, private val wrongAnswer: List<String>) {

    /**
     * Companion object for managing quiz initialization and storage.
     * Provides functions to initialize different categories of quiz questions and store them.
     * Also responsible for loading all questions and answers from predefined lists.
     */
    companion object QuizManager {

        val allQuizes: MutableList<Quiz> = mutableListOf()  // List to store all quiz questions

        /**
         * Add all question/answer pairs related to animals to the list of questions.
         * @param questions the list of all questions with answers
         */
        private fun initialiseAnimalQuestions(questions: List<Pair<Pair<String, String>, List<String>>>) {
            for (quiz in questions) {
                val solution = quiz.first
                allQuizes.add(AnimalQuiz(solution.first, solution.second, quiz.second))
            }
        }

        /**
         * Add all question/answer pairs related to history to the list of questions.
         * @param questions the list of all questions with answers
         */
        private fun initialiseHistoryQuestions(questions: List<Pair<Pair<String, String>, List<String>>>) {
            for (quiz in questions) {
                val solution = quiz.first
                allQuizes.add(PoliticQuiz(solution.first, solution.second, quiz.second))
            }
        }

        /**
         * Add all question/answer pairs related to politics to the list of questions.
         * @param questions the list of all questions with answers
         */
        private fun initialisePolitcQuestions(questions: List<Pair<Pair<String, String>, List<String>>>) {
            for (quiz in questions) {
                val solution = quiz.first
                allQuizes.add(PoliticQuiz(solution.first, solution.second, quiz.second))
            }
        }

        /**
         * Add all question/answer pairs related to science to the list of questions.
         * @param questions the list of all questions with answers
         */
        private fun initialiseScienceQuestions(questions: List<Pair<Pair<String, String>, List<String>>>) {
            for (quiz in questions) {
                val solution = quiz.first
                allQuizes.add(ScienceQuiz(solution.first, solution.second, quiz.second))
            }
        }

        /**
         * Add all question/answer pairs related to sport to the list of questions.
         * @param questions the list of all questions with answers
         */
        private fun initialiseSportQuestions(questions: List<Pair<Pair<String, String>, List<String>>>) {
            for (quiz in questions) {
                val solution = quiz.first
                allQuizes.add(SportQuiz(solution.first, solution.second, quiz.second))
            }
        }

        /**
         * Add all question/answer pairs related to geography to the list of questions.
         * @param questions the list of all questions with answers
         */
        private fun initialiseGeographyQuestions(questions: List<Pair<Pair<String, String>, List<String>>>) {
            for (quiz in questions) {
                val solution = quiz.first
                allQuizes.add(GeographyQuiz(solution.first, solution.second, quiz.second))
            }
        }

        /**
         * Loads all questions and answers from lists.
         */
        fun initialiseQuiz() {
            initialiseGeographyQuestions(geographyQuestions)
            initialiseSportQuestions(sportsQuestions)
            initialiseAnimalQuestions(animalQuestions)
            initialiseHistoryQuestions(historyQuestions)
            initialisePolitcQuestions(politicsQuestions)
            initialiseScienceQuestions(scienceQuestions)
        }

    }

    /**
     * Performs a text-answer quiz where the user must input an answer.
     * @param player the player participating in the quiz
     */
    fun textQuiz(player: Player) {
        println("\n\t\t${UNDERLINE}Text-Answers$reset ${RED}${UNDERLINE}5x points!$reset \n")

        printQuestion()
        Thread.sleep(200)

        val roundJoker =
            player.showJoker(listOf(HighlightJoker::class, FiftyFiftyJoker::class))
        if (roundJoker.isNotEmpty()) {
            when (player.chooseJoker(roundJoker)) {
                is SkipJoker -> return
            }
        }
        val answer: String = readTextAnswer()
        Thread.sleep(200)
        if (isCorrect(answer)) {
            println("$GREEN_BACKGROUND$BOLD----------CORRECT!----------$reset")
            println("The correct answer is: $BOLD${this.answer}$reset")
            player.points += 5
        } else {
            println("$RED_BACKGROUND-----------WRONG!-----------$reset")
            println("The correct answer is: $BOLD${this.answer}$reset")
        }
    }

    /**
     * Performs a multiple-choice quiz where the user must select one of several predefined answers.
     * @param player the player participating in the quiz
     */
    fun multipleChoiceQuiz(player: Player) {
        println("\n\t\t${UNDERLINE}Multiple choice$reset\n")

        val answers = printMultipleChoice()
        Thread.sleep(200)

        if (player.jokers.isNotEmpty()) {
            val roundJoker = player.showJoker(listOf())
            when (player.chooseJoker(roundJoker)) {
                is SkipJoker -> return
                is HighlightJoker -> {
                    answers.forEachIndexed { index, option ->
                        if (option == answer) {
                            print("$BOLD$GREEN_BACKGROUND${'A' + index}) $option$reset\n")
                            Thread.sleep(200)
                        } else {
                            print("${'A' + index}) $option\n")
                            Thread.sleep(200)
                        }
                    }
                }

                is FiftyFiftyJoker -> {
                    while (answers.size > 2) {
                        answers.remove(wrongAnswer.random())
                    }
                    answers.forEachIndexed { index, option ->
                        print("${'A' + index}) $option\n")
                        Thread.sleep(200)
                    }
                }
            }
        }

        val answerIndex: Int = readMultipleAnswer()
        Thread.sleep(200)

        if (isCorrect(answers[answerIndex])) {
            println("$GREEN_BACKGROUND$BOLD----------CORRECT!----------$reset")
            println("The correct answer is: $BOLD${this.answer}$reset")
            player.points++
        } else {
            println("$RED_BACKGROUND-----------WRONG!-----------$reset")
            println("The correct answer is: $BOLD${this.answer}$reset")
        }

    }

    /**
     * Performs a true or false quiz where the user must decide if a statement is true or false.
     * @param player the player participating in the quiz
     */
    fun trueOrFalseQuiz(player: Player) {
        println("\n\t\t${UNDERLINE}True or False$reset\n")

        printQuestion()
        Thread.sleep(200)


        val roundJoker: List<Joker> =
            player.showJoker(listOf(HighlightJoker::class, FiftyFiftyJoker::class))
        if (roundJoker.isNotEmpty()) {
            when (player.chooseJoker(roundJoker)) {
                is SkipJoker -> return
            }
        }

        val answerOption: String = listOf(answer, wrongAnswer.random()).random()
        println("Do you think the following answer is correct?")
        println()
        println("${UNDERLINE}\t\t$answerOption\t\t$reset")

        val answer: Boolean = readTrueOrFalse()
        if (answer && isCorrect(answerOption)) {
            println("$GREEN_BACKGROUND$BOLD----------CORRECT!----------$reset")
            println("The correct answer is: $BOLD${this.answer}$reset")
            player.points++
        } else if (!answer && !isCorrect(answerOption)) {
            println("$GREEN_BACKGROUND$BOLD----------CORRECT!----------$reset")
            println("The correct answer is: $BOLD${this.answer}$reset")
            player.points++
        } else {
            println("$RED_BACKGROUND-----------WRONG!-----------$reset")
            println("The correct answer is: $BOLD${this.answer}$reset")
        }
    }

    /**
     * Prints the question.
     */
    private fun printQuestion() {
        println(questions)
        Thread.sleep(1000)
    }

    /**
     * Prints the question and multiple-choice options for a multiple-choice quiz.
     * @return a list of possible answers
     */
    private fun printMultipleChoice(): MutableList<String> {

        println("$questions\n")
        Thread.sleep(1000)

        val allOptions = wrongAnswer + answer
        val answers = allOptions.shuffled().toMutableList()
        answers.forEachIndexed { index, option ->
            print("${'A' + index}) $option\n")
            Thread.sleep(200)
        }
        return answers
    }

    /**
     *Checks whether the user's entered answer is at least 50% correct.
     * @param input the user's input answer
     * @return true if the answer is correct, otherwise false
     */
    private fun isCorrect(input: String): Boolean {
        val maxAllowedDeviation: Int = (answer.length * 0.5).toInt()
        return deviation(answer.lowercase(), input.lowercase()) <= maxAllowedDeviation
    }
}
