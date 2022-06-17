package OOP;
public class Classroom {
    //Private Members
    private static Teacher[] teachers;
    private static Student[] students;
    private static final int FIRST_NAME = 0;
    private static final int LAST_NAME = 1;

    //Main Method for the classroom processing.
    public static void main(String[] args) {
        
        //Review Arrays - and cover Multi-Dimensional Arrays
        //Create teachers

        //Create Students
        //First, here is a String Array of names from our class:
        String[][] studentNames = { {"Abdella", "Abdushukur"},
                                    {"Adrian", "Khaskin"},
                                    {"Angel", "Concepcion"},
                                    {"Anug", "Saha"},
                                    {"Caroline", "Rives"},
                                    {"Conner", "Gleason"},
                                    {"James", "Hortman"},
                                    {"John", "Lee"},
                                    {"Juan", "Restrepo"},
                                    {"LaToya", "Bailey"},
                                    {"Mohamed", "Ibrahim"},
                                    {"Oscar", "Cerrato"},
                                    {"Paxton", "Edgar"},
                                    {"Sabrina", "Chowdhury"},
                                    {"Sean", "Jung"},
                                    {"Sercan", "Tuna"},
                                    {"Youngyo", "Na"}
        };

        // To add to the array of students,
        //   we need to create an array in memory.
        // 
        // Note that arrays are of fixed size,
        //   we cannot add or subtract from the array.
        //   to make an array bigger, we need to make a
        //   new array.
        students = new Student[studentNames.length];
        //Note that studentNames.length is a public member! not a method,
        //length is public and final, it can be viewed but not changed.


        //Create each Student object and then add them to an array index!
        //What is this for loop doing in english?
        //For each integer i from 0 to...

        //Pair Students into groups
        //Student[] groups = groupStudents(10);

    }   
}
