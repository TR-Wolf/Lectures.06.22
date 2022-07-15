package Main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunnerMain {
    private static String fileName = "";
    public static final String JSONFILE = "myStudents.json";
    public static final String CSVFILE = "studentNames.csv";
    public static final String TXTFILE = "studentNames.txt";
    public static void main(String[] args) {
        // Today we are covering
        // Using String Arguments (from Command Line)
        // Using String Arguments from IDE Configuration
        // Opening a file
        // Reading data from a file into a list of objects
        // Writing data from a list of objects into a file
        // again, but in Json,
        // again, but with Serialization.

        // Read and Writing to Files
        writeCsv(CSVFILE, reading());

        //Ok, lets parse a file we just made
        List<Student> studentList = parseCsv();

        //And now lets print what we read into a JSON string
        try {
            writeJson(studentList);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Old hash code:" + studentList.hashCode());
        studentList = null;

        try {
            studentList = readJson();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("New hash code:" + studentList.hashCode());

        //SERIALIZATION
        //Last topic for today is Serialization
//        Student preSerializedStudent;
//        if (studentList.size() == 0) {
//            preSerializedStudent = new Student("Example", "Student", 1);
//        }
//        preSerializedStudent = studentList.get(0);
//        serializeObject(preSerializedStudent);
//
//        Student deserializedStudent = (Student) deserializeObject();
//
//        System.out.println("Let's compare the toStrings of our two Students");
//        System.out.println(preSerializedStudent.toString());
//        System.out.println(deserializedStudent.toString());
//        System.out.println("\n Now are these the exact same object? Hashcodes:");
//        System.out.println(preSerializedStudent.hashCode());
//        System.out.println(deserializedStudent.hashCode());
    }

    public static List<Student> reading()  {
        //Using arguments for now.

        System.out.println("The user has chosen this file: " + TXTFILE);
        // If the File of this file name does not exist, exit program
        if (!new File(TXTFILE).exists()) {
            System.out.println("Can't open file.");
            return null;
        }

        //Get the contents of the file from our File Reader, made by curriculum.
        String contentsOfFile = FileReader.readFromFile(TXTFILE);
        //System.out.println("Here is the content of the file: ");
        //System.out.println(contentsOfFile);

        try {
            FileReader.writeToFile("UselessFile.txt", "data");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Let's read it on our own now, into an arrayList.
        List<Student> students = new ArrayList<>();
        Scanner scanner = null;
        String thisLine = "";

        try {
            // Open Scanner with chosen file.
            File myFile = new File(TXTFILE);
            scanner = new Scanner(myFile);

            //While the file reader has a next line to read
            while (scanner.hasNextLine()) {
                //Read in the next line
                thisLine = scanner.nextLine();

                //Format it as a Student object=
                //String.split will split the name by spaces i.e. "thomas wolf" -> { "thomas", "wolf" }
                String[] name = thisLine.split("\t");
                if (name.length >= 2) {
                    String firstName = name[0];
                    String lastName = name[1];
                    Student thisStudent = new Student(firstName, lastName);
                    //Add student to our list of students.
                    students.add(thisStudent);
                }
            }
        } catch (Exception e) {
            System.out.println("Error occured while reading file, exiting...");
            return null;
        }

        //At this point in the program we have an ArrayList of Student objects.
        //For each student inside of students print their to string.
        for (Student student : students) {
            System.out.println(student.toString());
        }

        return students;
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
        stringBuffer.append("StudentID, FirstName, LastName\n");

        //For each student inside of students write them to fileWriter.
        for (Student student : students) {
            stringBuffer.append(student.toString() + "\n");
        }
        fileName = "sb" + fileName;
        try (FileWriter fileWriter = new FileWriter(fileName);) {
            //add a header to csv file.
            fileWriter.write(stringBuffer.toString());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public static List<Student> parseCsv() {
        //Let's create a list of students to save our data to.
        List<Student> students = new ArrayList<>();

        //We are going to open the file using a Scanner.
        File csvFile = new File(CSVFILE);
        Scanner scanner;
        try {
            scanner = new Scanner(csvFile);
        } catch (Exception e) {
            System.out.println("File does not exist");
            return null;
        }
        System.out.println("File does exist!");

        //First let's read off the header
        String header = scanner.nextLine();

        //While there is a next line in the file
        while (scanner.hasNextLine()) {
            //Read off the next line
            String thisLine = scanner.nextLine();

            //Split on commas
            String[] studentStrings = thisLine.split(",");

            //Make a student object
            int studentID = Integer.parseInt(studentStrings[0]);
            String firstName = studentStrings[1];
            String lastName = studentStrings[2];

            Student student = new Student(firstName, lastName, studentID);

            //Add the student to the list.
            students.add(student);
        }

        //Return the finished list
        return  students;
    }

    public static void writeJson(List<Student> students) throws JsonProcessingException {
        //JSON
        // A student object will consist of
        // {"firstname":"", "lastName":"", "studentNumber":#}
        // Example:
        // Car
        // objectname: {"EngineName":Engine, "YearCreated":2022 ...... Motors: [                ]}

        //After importing 'com.fasterxml.jackson' using the Canvas tutorial
        //I can now use ObjectMapper to write our object as a JSON string:
        String json = new ObjectMapper().writeValueAsString(students);
        System.out.println(json);
        //Write JSON to file.
        try {
            FileReader.writeToFile(JSONFILE, json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<Student>  readJson() throws JsonProcessingException {
        //JSON
        // A student object will consist of
        // {"firstname":"", "lastName":"", "studentNumber":#}
        // Example:
        // Car
        // objectname: {"EngineName":Engine, "YearCreated":2022 ...... Motors: [                ]}

        //After importing 'com.fasterxml.jackson' using the Canvas tutorial
        //I can now use ObjectMapper to write our object as a JSON string:

        String json = FileReader.readFromFile(JSONFILE);
        //return new ObjectMapper().readValue(json, List<Student>.class)
        try {
            return Arrays.asList(new ObjectMapper().readValue(new File(JSONFILE), Student[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // SERIALIZATION
    static void serializeObject(Object o) throws IOException {
        ObjectOutputStream objectStream = null;
        try {
            FileOutputStream objFile = new FileOutputStream("person.dat");
            objectStream = new ObjectOutputStream(objFile);
            objectStream.writeObject(o);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (objectStream != null) {
                objectStream.flush();
                objectStream.close();
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
