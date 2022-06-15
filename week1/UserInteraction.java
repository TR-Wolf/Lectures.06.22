package week1;

import javax.sound.sampled.SourceDataLine;

public class UserInteraction {
    //Main
    public static void main(String[] args) {
        //Getting and Using Input


        //Exception Handling
    }

    //Get Input from User (Method)
    int getIntegerFromUser(){
        int returnValue = 0;

        return returnValue;
    }
    


    /*
     * Pre-Written Code 
     */
    //Prints a Circle
    public static String printCircle(int isz){
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
        return circle;
    }
    
    //Prints a Triangle
    public static String printTriangle(int size){
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
        return triangle;
    }
    
    //Prints a Square
    public static String printSquare(int size){
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
        return square;
    }
}
