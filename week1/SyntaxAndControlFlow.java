package week1;

public class SyntaxAndControlFlow {
    public static void main(String[] args) {
        // //Hello World
        // System.out.println("Hello World!");
        divide(5.0, 3.2);

        //String Message
        String msg = "Hello World!";
        System.out.println(msg);

        //Divying up cookies between a class of students.
        //What variables do we need?
        String[] students = {"Bob", "joe", "jennifer"};
        int numOfStudents = students.length;

        int numOfCookies = 9;
        String cookieType = "Chocolate";


        int cookiesPerStudent = numOfCookies / numOfStudents;

        System.out.println("Each student gets " + cookiesPerStudent + " cookies.");
        int extraCookies = numOfCookies % numOfStudents;

        numOfCookies = numOfCookies % numOfStudents;

        

        
        //Empty Class / No students??? (If's)

        //Using Doubles (Extra cookie(s) with Modulus or Dividing Cookies)

        //Conditionals ()
        if (extraCookies > 0){
            System.out.println("We have " + extraCookies + " extra cookies");
        } else {
            System.out.println("We are out of cookies");
        }

        //Arrays
        // for (int i = 0; i < students.length; i++) {
        //     students[i]
        // }
        for (String string : students) {
            
        }
        for(String student : students) {
            System.out.println(student + " gets " + cookiesPerStudent);
        }

        return;
    }

    public static double divide (double numerator, double divisor) {
        return numerator / divisor;
    }
}