package FactoryPackage;

class MultipleChoiceTriviaQuestion implements TriviaQuestion {
    private String question = "";
    private String[] answers;
    private String correctAnswer;
    //Default constructor
    public MultipleChoiceTriviaQuestion(String question, String[] answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
    //Secondary Constructor for integer answers
    public MultipleChoiceTriviaQuestion(String question, String[] answers, Integer correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer.toString();
    }

    @Override
    public void askQuestion() {
        System.out.println(question);
        for (int i = 1; i <= answers.length; i++) {
            System.out.println(String.format("%d. %s", i, answers[i-1]));
        }
    }
    @Override
    public boolean isRight(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}