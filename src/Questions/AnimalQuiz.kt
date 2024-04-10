package Questions
/**
 * Represents a quiz about animals.
 * @param questions the text of the question
 * @param answer the correct answer to the question
 * @param wrongAnswer wrong multiple choice answers
 */
class AnimalQuiz(
    questions: String,
    answer: String,
    wrongAnswer: List<String>
) : Quiz(questions, answer, wrongAnswer)