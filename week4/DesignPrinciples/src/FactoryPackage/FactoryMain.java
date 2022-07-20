package FactoryPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FactoryMain {
    //public static void main(String[] args) {
    public static void runMain() {
        //On my end of things,
        TriviaQuizFactory myFactory = new TriviaQuizFactory();

        boolean playingGames = true;
        Scanner sc = new Scanner(System.in);
        while (playingGames) {
            TriviaQuiz chosenQuiz = myFactory.getQuiz(sc);
            if (chosenQuiz == null) {
                playingGames = false;
            } else {
                //While the chosen quiz has a next question available
                int questionNumber = 1;
                while (chosenQuiz.hasNextQuestion()) {
                    //Get the next question from the quiz
                    TriviaQuestion thisQuestion = chosenQuiz.getNextQuestion();
                    //Ask this question
                    System.out.println("+~~~~~-- ---------- --~~~~~+");
                    System.out.println("Question number " + questionNumber++);
                    thisQuestion.askQuestion();
                    //get an answer from the user
                    System.out.print("Input your answer choice here:");
                    String answer = sc.nextLine();
                    //If this question is right for this answer then add 1 point
                    if (thisQuestion.isRight(answer)) {
                        System.out.println("+~~~~~-- CORRECT!!! --~~~~~+");
                        chosenQuiz.addPoints(1);
                    } else {
                        System.out.println("+------- incorrect. -------+");
                    }
                }
                System.out.println("You received " + chosenQuiz.getTotalScore() + " points!");
            }

        }
    }
}