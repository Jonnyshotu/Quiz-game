package Questions
/**
 * Represents a quiz about politics.
 * @param questions the text of the question
 * @param answer the correct answer to the question
 * @param wrongAnswer wrong multiple choice answers
 */
class PoliticQuiz(
    questions: String,
    answer: String,
    wrongAnswer: List<String>
) : Quiz(questions, answer, wrongAnswer)