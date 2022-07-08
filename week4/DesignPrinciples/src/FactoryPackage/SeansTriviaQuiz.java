package FactoryPackage;

import java.util.ArrayList;
import java.util.List;

public class SeansTriviaQuiz implements TriviaQuiz{
    private final List<TriviaQuestion> questions;
    private int count;
    private int total;
    //Constructor to initialize all the questions, point tracker and question tracker
    public SeansTriviaQuiz () {
        //Initialize a list of questions
        questions = new ArrayList<>();
        count = 0;
        //add MC Questions to my list of questions
        questions.add(new MultipleChoiceTriviaQuestion("How many continents are there in the world?", new String[]{"5", "6", "7", "8"}, 3));
        questions.add(new MultipleChoiceTriviaQuestion("What measurement scale is used to determine wind speed?", new String[]{"Beaufort scale", "Richter scale", "Synoptic scale", "Gusting scale"}, 1));
        questions.add(new MultipleChoiceTriviaQuestion("The human body is made up of approximately how much water?", new String[]{"40%", "50%", "60%", "70%"}, 3));
        questions.add(new MultipleChoiceTriviaQuestion("What is the world’s fastest species of bird?", new String[]{"Golden eagle", "Peregrine falcon", "Frigate bird", "Penguin"}, 2));
        questions.add(new MultipleChoiceTriviaQuestion("Which artist famously cut off his own ear?", new String[]{"Vincent Van Gogh", "Claude Monet", "Salvador Dali", "Pablo Picasso"}, 1));
        questions.add(new MultipleChoiceTriviaQuestion("What was the first country to use tanks in combat during World War I?", new String[]{"France", "Japan", "Britain", "Germany"}, 3));
        questions.add(new MultipleChoiceTriviaQuestion("Which of the following animals can run the fastest?", new String[]{"Cheetah", "Leopard", "Tiger", "Lion"}, 1));
        questions.add(new MultipleChoiceTriviaQuestion("The two biggest exporters of beers in Europe are Germany and …", new String[]{"Spain", "France", "Italy", "Belgium"}, 4));
        questions.add(new MultipleChoiceTriviaQuestion("What does the term \"SOS\" commonly stand for?", new String[]{"Save Our Sheep", "Save Our Ship", "Save Our Seal", "Save Our Souls"}, 4));
        questions.add(new MultipleChoiceTriviaQuestion("We often use sodium bicarbonate in the kitchen. What is its other name?", new String[]{"Vinegar", "Sugar", "Salt", "Baking soda"}, 4));
    }

    @Override
    public boolean hasNextQuestion() {
        return count < questions.size();
    }

    @Override
    public TriviaQuestion getNextQuestion() {
        return questions.get(count++);
    }

    @Override
    public void addPoints(int points) {
        total = total + (points * 10);
    }

    @Override
    public int getTotalScore() {
        return total;
    }
}
