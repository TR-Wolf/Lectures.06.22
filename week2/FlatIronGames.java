import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlatIronGames {
    
    public static void main(String[] args) {
        Map<String, TriviaQuiz> quizzes = new HashMap<>(); // TODO proper type parameters
        TriviaQuiz thomasGame = new ThomasQuiz();
        // quizes.put("Abdella", abdellasGame); // TODO figure out how to do this line
        quizzes.put("Thomas", thomasGame); // TODO add in all your team's members and games

        try(Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.println("Whose quiz do you want to play? " + quizzes.keySet());
                String choice = scanner.nextLine();
                TriviaQuiz thisQuiz = quizzes.get(choice);

                //While the quiz has questions
                while (thisQuiz.hasNextQuestion()){
                    //get the question from the quiz
                    TriviaQuestion thisQuestion = thisQuiz.getNextQuestion();
                    //ask the question
                    thisQuestion.askQuestion();
                    String answer = scanner.nextLine();
                    //check if the users is answer is right
                    if (thisQuestion.isRight(answer)){
                        System.out.println("You are correct!");
                        thisQuiz.addPoint();
                    }
                }
                System.out.println("Your score is:" + thisQuiz.getTotalScore());

            }
        }
    }
}

interface TriviaQuestion {
    void askQuestion();
    boolean isRight(String userAnswer);
}

// TODO implement a MultipleChoiceTriviaQuestion class
class MultipleChoiceTriviaQuestion implements TriviaQuestion {
    private String question;
    private String[] choices;
    private int answer;
    public MultipleChoiceTriviaQuestion(String question, String[] choices, int answer) {
        this.question = question;
        this.choices = choices;
        this.answer = answer;
    }
    @Override
    public void askQuestion() {
        System.out.println(this.question);
        int choiceCounter = 1;
        for (String choice : choices) {
            System.out.println(choiceCounter + ": " + choice );
            choiceCounter++;
        }
    }
    // expecting a one index answer
    @Override
    public boolean isRight(String userAnswer) {
        // TODO Auto-generated method stub
        int userAnswerInt = Integer.parseInt(userAnswer);
        return userAnswerInt == this.answer;
    }
    public String getQuestion() {
        return question;
    }
}
// TODO implement a FreeFormTriviaQuestion class

interface TriviaQuiz {
    boolean hasNextQuestion();
    TriviaQuestion getNextQuestion();
    int getTotalScore();
    void addPoint();
}
class SeanQuiz implements TriviaQuiz {
    SeanQuiz(){
        //add MC Questions to my list of questions
        TriviaQuestion questionOne = new MultipleChoiceTriviaQuestion(question, choices, answer);
    }
    @Override
    public boolean hasNextQuestion() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public TriviaQuestion getNextQuestion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getTotalScore() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void addPoint() {
        // TODO Auto-generated method stub
        
    }

}
 class ThomasQuiz implements TriviaQuiz {
    TriviaQuestion[] myQuestions = new TriviaQuestion[3];
    int questionNumber;
    public int point = 0;

    ThomasQuiz () {
        String[] q1answers = {"200", "400", "1600", "8000"};
        TriviaQuestion q1 = new MultipleChoiceTriviaQuestion("20 to the power of 3", q1answers, 4);
        myQuestions[0] = q1;
    }
    @Override
    public boolean hasNextQuestion(){
        return (questionNumber < myQuestions.length);
    }
    @Override
    public TriviaQuestion getNextQuestion() {
        return myQuestions[questionNumber++];
    }
    @Override
    public int getTotalScore() {
        return point;
    }
    @Override 
    public void addPoint() {
        point++;
    }
}