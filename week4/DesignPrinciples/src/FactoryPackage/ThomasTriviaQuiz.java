package FactoryPackage;

import java.util.LinkedList;
import java.util.Queue;

public class ThomasTriviaQuiz implements TriviaQuiz {
    private Queue<TriviaQuestion> questions;
    private int totalPoints = 0;

    ThomasTriviaQuiz() {
        questions = new LinkedList<>();
        questions.add(new FreeformTriviaQuestion("USA stands for the United ______ of America.", "States"));
        questions.add(new FreeformTriviaQuestion("In Runescape what is the final boss in the fight caves minigame?", "Jad"));
        questions.add(new MultipleChoiceTriviaQuestion("Which was the first film by Disney to be produced in colour?", new String[]{"Toy Story", "Sleeping Beauty", "Snow White and the Seven Dwarfs", "Cinderella"}, 3));
        questions.add(new MultipleChoiceTriviaQuestion("How many time zones are there in total in the world?", new String[]{"8", "16", "24", "32"}, 3));
        questions.add(new MultipleChoiceTriviaQuestion("What is the rarest type of blood in the human body?", new String[]{"AB negative", "O positive", "B negative", "A positive"}, 1));
        questions.add(new MultipleChoiceTriviaQuestion("The fear of insects is known as what?", new String[]{"Arachnophobia", "Ailurophobia", "Entomophobia", "Clastophobia"}, 3));
        questions.add(new MultipleChoiceTriviaQuestion("Which state is the smallest state in the US?", new String[]{"Delaware", "Washington DC", "Rhode Island", "Connecticut"}, 3));
    }

    @Override
    public boolean hasNextQuestion() {
        return questions.iterator().hasNext();
    }

    @Override
    public TriviaQuestion getNextQuestion() {
        return questions.remove();
    }

    @Override
    public void addPoints(int points) {
        totalPoints += points;
    }

    @Override
    public int getTotalScore() {
        return totalPoints;
    }
}
