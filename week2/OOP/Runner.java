package OOP;

import OOP.Teacher;
import OOP.Student;

public class Runner {
    //Main Method for the classroom processing.
    public static void main(String[] args) {
        //Advantadges of OOP
        //Organized, Reusable, Testable, Easier for Programmers (Maintenance)
        

        //EXAMPLES
        //Experience with Legacy Fortran System:
        //ls[radar][launcher][][][]
        // student number, name (first or last), 
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
        // array of students names
        // [{first name} { last name}] -- array of size 2
        // [17] student names ^ [#][0] - first name [#][1] - last name of student #
        // To add to the array of students,
        //   we need to create an array in memory.
        // 
        // Note that arrays are of fixed size,
        //   we cannot add or subtract from the array.
        //   to make an array bigger, we need to make a
        //   new array.
        //17. cant change
        // ##### ### ##### #-------------------------#################
        
        //Note that studentNames.length is a public member! not a method,
        //length is public and final, it can be viewed but not changed.
        //
        //
        //Create each Student object and then add them to an array index!
        //What is this for loop doing in english?
        //For each integer i from 0 to...
        Student[] students = new Student[studentNames.length]; 
        
        System.out.println("students of 0:" + students[0]);

        //For every student name, make a student object and add them to the array.
        //[null, null, null, null, null, null, null, null, null, null, null, null, null, null]
        for (int i = 0; i < studentNames.length; i++) {
            String fname = studentNames[i][0];
            String lname = studentNames[i][1];
            Student thisStudent = new Student(fname, lname);
            students[i] = thisStudent;
        }

        System.out.println("students of 0:" + students[0].toString());

        //Initialize Teachers
        Teacher[] teachers = new Teacher[2];
        Teacher thomas = new Teacher(thomasName[0], thomasName[1]);
        Teacher jay = new Teacher(jayName[0], jayName[1]);
        teachers[0] = jay;
        teachers[1] = thomas;

        //Make a classroom
        Classroom blackrockCourse = new Classroom(teachers, students);

        blackrockCourse.printClass();

        //Let's cast thomas as a person instead of a teacher
        Person thomasPerson = thomas;
        System.out.println(thomasPerson.introduction());

        //but what if I want to be a teacher again
        Teacher thomasTeacher = (Teacher)thomasPerson;
        System.out.println(thomasTeacher.introduction());




        //What can we do with these objects?
        

        //Check if a student is in a class (quick example)
        //In class example
        // students = classroom.getStudents();
        // //Grab a random student from our class room
        // Student randomStudent = students[Math.floor(Math.random()*(students.length))];
        // if (isStudentInClass(randomStudent, classroom)){
        //     System.out.println("Student:" + randomStudent.getFname() +" is in our class!");
        // } else {
        //     System.out.println("Student:" + randomStudent.getFname() +" is not in our class. :(");
        // }

        //Pair Students into groups
        //Student[] groups = groupStudents(10);
    }

    public static boolean isStudentInClass(Student student, Classroom classroom) {
        boolean isInClass = false;

        return isInClass;
    }
}
