package week1;

import javax.sound.sampled.SourceDataLine;

public class UserInteraction {
    //Main
    public static void main(String[] args) {
        //Getting and Using Input
        printHeader();

        //Get in a loop.

        //Using If's to solve problem

        //Using Switch


        //Exception Handling
    }

    //Get Input from User (Method)
    //Only allow for choices 1, 2, 3, or 4.
    int getIntegerFromUser(){
        int returnValue = 0;

        return returnValue;
    }
    

    /*
     *
     * Pre-Written Code 
     * 
     */
    public static void printHeader(){
        System.out.println("+---~~~  Shape Printer Program!  ~~~---+");
        System.out.println("| Which shape would you like to print? |");
        printOptions();
        
    }
    
    public static void printOptions(){
        System.out.println("+---~~~+---{Options}-------------~~~---+");
        System.out.println("|  1.  | Print a Square.               |");
        System.out.println("|  2.  | Print a Triangle.             |");
        System.out.println("|  3.  | Print a Circle.               |");
        System.out.println("|  4.  | Exit Program.                 |");
        System.out.println("+---~~~+-------------------------~~~---+");
        System.out.print("| Enter your Choice here : ");
    }

    //Prints a Circle
    public static void printCircle(int isz){
        String circle = "";
        double radius = (double)isz;
        isz = isz * 2 + 2;
        for (int i =(-1) * isz / 2; i < (isz / 2) + 1; i++){
            for (int j = (-1) * isz / 2; j < (isz / 2) + 1; j++) {
                double thisRad = Math.sqrt(i*i + j*j);
                if (thisRad > radius) {
                    circle += "`.";
                } else {
                    if (radius - thisRad < 1.2){
                        circle += "%%";
                    } else {
                        circle += "##";
                    }
                }
                if (j == isz/2){
                    circle += "\n";
                }
            }
        }
        System.out.println(circle);
    }
    
    //Prints a Triangle
    public static void printTriangle(int size){
        String triangle = "";
        for (int i = 0; i < size; i++){
            for (int j = i; j < size; j++) {
                if (i == 0 || i == size - 1){
                    if (j == 0){
                        triangle += "+";
                    } else if (j == size - 1){
                        triangle += "+\n";
                    } else {
                        triangle += "-";
                    }
                } else {
                    if (j == i) {
                        triangle += "|";
                    } else if (j == size - 1) {
                        triangle += "|\n";
                    } else {
                        triangle += "`";
                    }
                }
            }
        }
        System.out.println(triangle);
    }
    
    //Prints a Square
    public static void printSquare(int size){
        String square = "";
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1){
                    if (j == 0){
                        square += "+";
                    } else if (j == size - 1){
                        square += "+\n";
                    } else {
                        square += "-";
                    }
                } else {
                    if (j == 0) {
                        square += "|";
                    } else if (j == size - 1) {
                        square += "|\n";
                    } else {
                        square += "`";
                    }
                }
            }
        }
        System.out.println(square);
    }
}
