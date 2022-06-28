import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.SpinnerDateModel;

public class PsuedoCode {
    //Main method
    public static void main(String[] args) {
        //Example One, Trivia Game
        Scanner scanner = new Scanner(System.in);
        triviaGame(scanner);    
        
        //Example Two, prime numbers;

        // System.out.println("Here are the first 5 prime numbers:");
        // printPrimes(primeNumbers(2));
        
        // System.out.println("Here are the first 50 prime numbers:");
        // printPrimes(primeNumbers(100));

        //Example Three, remove vowels]
        
        // System.out.println(removeVowels("Hello World!"));
        // System.out.println(removeVowels("")); // trying it out with an empty string
        
        // String darthPlagueis = "\"Did you ever hear the tragedy of Darth Plagueis the Wise?\"\n\"No.\"\n\"I thought not. It's not a story the Jedi would tell you. It's a Sith legend. Darth Plagueis... was a Dark Lord of the Sith so powerful and so wise, he could use the Force to influence the midi-chlorians... to create... life. He had such a knowledge of the dark side, he could even keep the ones he cared about... from dying.\"\n\"He could actually... save people from death?\"\n\"The dark side of the Force is a pathway to many abilities... some consider to be unnatural.\"\n\"Wh– What happened to him?\"\n\"He became so powerful, the only thing he was afraid of was... losing his power. Which eventually, of course, he did. Unfortunately, he taught his apprentice everything he knew. Then his apprentice killed him in his sleep. It's ironic. He could save others from death, but not himself.\"\n\"Is it possible to learn this power?\"\n\"Not from a Jedi.\"\n";
        // String drthPlgs = removeVowels(darthPlagueis);
        // System.out.println("+~~~  Darth Plagueis Paragraph:");
        // System.out.println(darthPlagueis);
        // System.out.println("\n ...and here is the paragraph without vowels:");
        // System.out.println(drthPlgs);
        
        scanner.close();
    }

    //*******************EXAMPLE ONE TRIVIA GAME ***************************/
    //A game where the system asks users yes or no questions,
    //and the user will tell the system their answer (y/n).
    //At the end of the game the user is shown how many points they recieved.
    private static void triviaGame(Scanner sc) {
        //Define the questions (String)

        //Define the answers (char)

        //Define a counter for points.

        //Tell the user about the game

        //For each question, ask the user a question
            //Ask the user a question

            //get an answer from the user

            //if the user has the correct answer, give them a point
        
        //Show the user how many points they recieved.
            

    }   
    

    public static void printHeader(){
        System.out.println("+~~~--~~~+");
        System.out.println("| Trivia |");
        System.out.println("|  Game  |");
        System.out.println("+~~~--~~~+");
    }
    public static void printQuestion(String question, int questionNumber){
        System.out.println("+~~~~---");
        System.out.println("| Question Number " + questionNumber);
        System.out.println("+~~~~---");
        System.out.println("| " + question);
        System.out.print("+~~~~--- yes, or no: ");
    }
    public static char getAnswerFromUser(Scanner sc){        
        //Create a variable for a scanner, and for a user character.
        char answerChar = 'x';

        boolean incorrectInput = true;
        //While there is incorrect input, prompt the user for new input
        while (incorrectInput) {
            //Get a line from the user, take it to lower case, and take the first character.
            String answerString = sc.nextLine().toLowerCase();
            answerChar = answerString.charAt(0);
            //if the answer character is not a y or an n, then our input is incorrect
            incorrectInput = (! (answerChar == 'y' || answerChar == 'n'));
            if (incorrectInput) {
                System.out.println("You may only answer 'y' or 'n' try again.");
                System.out.print("+~~~~--- yes, or no: ");
            }
        }
        return answerChar;
    }

    //*******************EXAMPLE TWO Prime Numbers ***************************/
    //I want a program that will tell me the first N prime numbers.
    //N is any number between 1-100, so don't worry about being too efficient.
    public static int[] primeNumbers(int n) {
        int[] primeNumbers = new int[n];
        
        if (n < 3) {
            if (n < 1) {
                return primeNumbers;
            }
            primeNumbers[0] = 1;
            if (n == 2) {
                primeNumbers[1] = 2;
            }
            return primeNumbers;
        }
        //Should we loop,While or For (We can solve it with both, poll students for preffered)
        //Volunteers to write psuedocode??

        return primeNumbers;
    }

    public static void printPrimes(int[] primes){
        System.out.println("+~-----~+");
        for (int i : primes) {
            String thisLine = String.format("| %5d |", i);
            System.out.println(thisLine);
        }
        System.out.println("+~-----~+");
    }

    //*******************EXAMPLE THREE Remove Vowels ***************************/
    //Given a String, I don't want any more Vowels in it, I am SICK of vowels!!!
    //
    //I.E. if the input is the String above the result should be:
        //Gvn  Strng,  dn't wnt ny mor Vwls n t,  am SCK f vwls!!!
    public static String removeVowels(String str){
        String vowellessString = "";

        return vowellessString;
    }

}