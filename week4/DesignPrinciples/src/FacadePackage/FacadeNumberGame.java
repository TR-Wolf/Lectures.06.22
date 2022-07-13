package FacadePackage;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.Scanner;

public class FacadeNumberGame {
    private int min = 0;
    private int max = 10;
    private int value;
    private int userNumber;
    private int userDifficulty;
    private int width = 100;
    private int height = 20;

    public void createBufferedImage() {
        // Buffered image
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("TimesNewRoman", Font.BOLD, 10));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("Guess the #", 20, 20);

        // Ascii Art section;
        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "#");
            }
            if (sb.toString().trim().isEmpty()) {
                continue;
            }
            System.out.println(sb);
        }
    }

    public static Scanner generateScanner () {
        return new Scanner(System.in);
    }

    public int getUserNumber(Scanner scanner) {
            System.out.print("Pick a number (0-10): ");
            String strNumber = scanner.nextLine();
            int number;
            try {
                number = Integer.parseInt(strNumber);
                if (number < 0 || number > 10) {
                    System.out.println("Number needs to be a number 0-10, try again.");
                    return getUserNumber(scanner);
                }
            } catch (Exception e) {
                System.out.println("Number needs to be a number 0-10, try again.");
                return getUserNumber(scanner);
            }
            return number;
    }

    public void getDifficulty(Scanner scanner) {

        System.out.println("Welcome Guest!");
        System.out.print("Do you want to play on easy(0), medium(1), or hard(2)? ");
        int userDifficulty = scanner.nextInt();
        String[] Levels = {"easy", "medium", "hard"};
        System.out.print("You choose " + Levels[userDifficulty] + ".");


        if (userDifficulty > 2 || userDifficulty < 0) {
            System.out.println("Pick a number within range!");
            getDifficulty(scanner);
            return;
        }
        this.userDifficulty = userDifficulty;
    }

    public void generateNumber() {
        Random random = new Random();
        value = random.nextInt(max + min) + min;
    }
    public void printDifficulty() {
        String[] Instructions = {
                " User wins if you guess higher or same as Computer",
                " User wins if you guess higher than Computer",
                " User wins if you guess exactly as Computer"};

        System.out.println(Instructions[userDifficulty]);
    }
    public void printWinner() {
        if (userNumber == value && userDifficulty == 0) {
            System.out.println("Your answer is the same. You Won!");
        } else if (userNumber == value && userDifficulty == 1) {
            System.out.println("Your answer is the same. Computer Wins!");
        } else if (userNumber < value && userNumber >= 0) {
            System.out.println("Your answer was too low. Computer Wins!");
        } else if (userNumber > 10 || userNumber < 0 && userNumber > value || userNumber < value) {
            System.out.println("Pick a number within range!");
        } else if (userNumber > value && userDifficulty == 2) {
            System.out.println("Your answer was too high. Computer Wins!");
        } else {
            System.out.println("Your answer was higher. You Win!");
        }
    }
}
