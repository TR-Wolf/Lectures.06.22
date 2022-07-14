package Main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnerMain {
    private static String fileName = "";
    public static void main(String[] args) throws IOException {
        // Today we are covering
        // Using String Arguments (from Command Line)
        // Using String Arguments from IDE Configuration
        // Opening a file

        //Read and Writing to files
        //readAndWriting(args);

        //Ok, lets parse a file we just made
        List<Student> studentList = parseCsv(args[1]);

        //And now lets print what we read into a JSON string
        //writeJson(studentList);



        //SERIALIZATION
        //Last topic for today is Serialization
        Student preSerializedStudent = studentList.get(0);
        serializeObject(preSerializedStudent);

        Student deserializedStudent = (Student) deserializeObject();

//        System.out.println("Let's compare the toStrings of our two Students");
//        System.out.println(preSerializedStudent.toString());
//        System.out.println(deserializedStudent.toString());
//        System.out.println("\n Now are these the exact same object? Hashcodes:");
//        System.out.println(preSerializedStudent.hashCode());
//        System.out.println(deserializedStudent.hashCode());
    }

    public static void readAndWriting(String[] args) throws JsonProcessingException {
        if (args.length > 0) {
            fileName = args[0];
        }
        try {
            FileReader.writeToFile("UselessFile.txt", "data");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The user has chosen this file: " + fileName);
        // If the File of this file name does not exist, exit program
        if (!new File(fileName).exists()) {
            System.out.println("Can't open file.");
            return;
        }

        //Get the contents of the file from our File Reader, made by curriculum.
        String contentsOfFile = FileReader.readFromFile(fileName);
        System.out.println("Here is the content of the file: ");
        System.out.println(contentsOfFile);

        //Let's read it on our own now, into an arrayList.
        List<Student> students = new ArrayList<>();
        Scanner fileReader = null;
        String thisLine = "";

        try {
            // Open file reader with chosen file.


            //While the file reader has a next line to read

            //Read in the next line

            //Format it as a Student object

            //String.split will split the name by spaces i.e. "thomas wolf" -> { "thomas", "wolf" }
            String[] name = thisLine.split(" ");
            if (name.length > 2) {
                String firstName = name[0];
                String lastName = name[1];
                //Add student to our list of students.
            }
        } catch (Exception e) {
            System.out.println("Error occured while reading file, exiting...");
            return;
        }
        students.add(new Student("Thomas","Wolf"));
        //At this point in the program we have an ArrayList of Student objects.
        //For each student inside of students print their to string.
        for (Student student : students) {
            System.out.println(student.toString());
        }

        writeCsv(args[1], students);
    }

    public static void writeCsv(String fileName, List<Student> students){
        //Well we can write these comma separated values to a file...
        //what kind of file would that be :thinking:....
        try (FileWriter fileWriter = new FileWriter(fileName);) {
            //add a header to csv file.
            fileWriter.write("StudentID, FirstName, LastName\n");
            //For each student inside of students write them to fileWriter.
            for (Student student : students) {
                fileWriter.write(student.toString() + "\n");
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        //Ok let's use a string buffer now!
        StringBuffer stringBuffer = new StringBuffer();
        //add a header to csv file.
        //"StudentID,FirstName,LastName\n"
        //For each student inside of students write them to fileWriter.
//        for (Student student : students) {
//            student.toString() + "\n"
//        }
        //filename = sb + filename
    }

    public static List<Student> parseCsv(String fileName) {
        //Let's create a list of students to save our data to.
        List<Student> students = new ArrayList<>();

        //We are going to open the file using a Scanner.


        //First let's read off the header

        //While there is a next line in the file
            //Read off the next line
            //Split on commas
            //Make a student object

        //Return the finished list
        students.add(new Student("Tom", "W"));
        students.add(new Student("Jay", "mans"));
        return  students;
    }

    public static void writeJson(List<Student> students) throws JsonProcessingException {
        //JSON
        // A student object will consist of
        // {"firstname":"", "lastName":"", "studentNumber":#}
        //After importing 'com.fasterxml.jackson' using the Canvas tutorial
        //I can now use ObjectMapper to write our object as a JSON string:
        String json = new ObjectMapper().writeValueAsString(students);
        System.out.println(json);

        //formatting
        String newJson = "";
        for (String s : json.split("},")) {
            newJson += s + "}\n";
        }
        System.out.println("Formatted JSON:\n" + newJson);

    }
    // SERIALIZATION

    static void serializeObject(Object o) throws IOException {
        ObjectOutputStream personObjectStream = null;
        try {
            FileOutputStream objFile = new FileOutputStream("person.dat");
            personObjectStream = new ObjectOutputStream(objFile);
            personObjectStream.writeObject(o);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (personObjectStream != null) {
                personObjectStream.flush();
                personObjectStream.close();
            }
        }
    }

    static Object deserializeObject() throws IOException {
        ObjectInputStream personInputStream = null;
        Object newObject = null;
        try {
            FileInputStream personFile = new FileInputStream("person.dat");
            personInputStream = new ObjectInputStream(personFile);
            newObject = personInputStream.readObject();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (personInputStream != null) {
                personInputStream.close();
            }
        }

        return newObject;
    }
}
