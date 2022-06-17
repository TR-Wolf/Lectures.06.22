package OOP;

public class Runner {
    //Main Method for the classroom processing.
    public static void main(String[] args) {
        //Advantadges of OOP
        //Organized, Reusable, Testable, Easier for Programmers (Maintenance)
        

        //EXAMPLES
        //Experience with Legacy Fortran System:
        //ls[][][][][]
        //One piece of data for one specific object
        //think:
        //   radarname[]
        //compared to radarsLaunchersMissilesMaximumRange[][][][]
        //it quickly gets out of hand.

        //Review Arrays - and cover Multi-Dimensional Arrays
        //Create teachers
        String[] thomasName = {"Thomas", "Wolf"};
        String[] jayName = {"Jay", "Mansmann"};

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

        //Note that studentNames.length is a public member! not a method,
        //length is public and final, it can be viewed but not changed.
        //
        //
        //Create each Student object and then add them to an array index!
        //What is this for loop doing in english?
        //For each integer i from 0 to...


        //What can we do with these objects?
        //Pair Students into groups
        //Student[] groups = groupStudents(10);
    }
}
