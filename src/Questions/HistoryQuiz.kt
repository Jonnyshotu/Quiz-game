package Questions
/**
 * Represents a quiz about history.
 * @param questions the text of the question
 * @param answer the correct answer to the question
 * @param wrongAnswer wrong multiple choice answers
 */
class HistoryQuiz(
    questions: String,
    answer: String,
    wrongAnswer: List<String>
) : Quiz(questions, answer, wrongAnswer)