package FactoryPackage;

import java.util.Locale;

public class FreeformTriviaQuestion implements TriviaQuestion {
    private String question;
    private String answer;
    FreeformTriviaQuestion(String question, String answer){
        this.question = question;
        this.answer = answer.toLowerCase().trim();
    }
    @Override
    public void askQuestion() {
        System.out.println(question);
    }

    @Override
    public boolean isRight(String userAnswer) {
        return userAnswer.equalsIgnoreCase(answer.trim());
    }
}
