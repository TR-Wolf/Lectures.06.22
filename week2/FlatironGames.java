import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlatironGames {
    
    public static void main(String[] args) {
        Map quizzes = new HashMap(); // TODO proper type parameters
        // games.put("Abdella", abdellasGame); // TODO figure out how to do this line
        // games.put("Thomas", thomasGame); // TODO add in all your team's members and games

        try(Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.println("Whose quiz do you want to play? " + quizzes.keySet());
                String choice = scanner.nextLine();
                // TODO start the quiz chosen by the user
                // TODO ideally move distinct pieces of functionality to separate methods
            }
        }
    }
}

interface TriviaQuestion {
    void askQuestion();
    boolean isRight(String userAnswer);
}

// TODO implement a MultipleChoiceTriviaQuestion class

// TODO implement a FreeFormTriviaQuestion class

interface TriviaQuiz {
    boolean hasNextQuestion();
    TriviaQuestion getNextQuestion();
    int getTotalScore();
}

// TODO each member of your team should add an implementation of TriviaQuiz
// Try NOT to consult each other when making your implementation of TriviaQuiz
// (the point is each TriviaQuiz implementation may work differently under the hood but the code above interacts with them all in the same way)
// Example: AbdellaTriviaQuiz, ThomasTriviaQuiz
