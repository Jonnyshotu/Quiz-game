package Questions
/**
 * Represents a quiz about geography.
 * @param questions the text of the question
 * @param answer the correct answer to the question
 * @param wrongAnswer wrong multiple choice answers
 */
class GeographyQuiz(
    questions: String,
    answer: String,
    wrongAnswer: List<String>
) : Quiz(questions, answer, wrongAnswer)