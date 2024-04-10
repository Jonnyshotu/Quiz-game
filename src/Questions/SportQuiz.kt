package Questions
/**
 * Represents a quiz about sport.
 * @param questions the text of the question
 * @param answer the correct answer to the question
 * @param wrongAnswer wrong multiple choice answers
 */
class SportQuiz(
    questions: String,
    answer: String,
    wrongAnswer: List<String>
) : Quiz(questions, answer, wrongAnswer)