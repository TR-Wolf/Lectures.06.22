import java.io.IOException;

public class SQLBasics {
    public static void main(String[] args) {
        System.out.println("I love SQL");
        try {
            FileReader.writeToFile("SQLStudents.txt", studentsAsSQL());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
           Structured Query Language SQL
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -

    Statements end in semicolon;

    Language is not case sensitive.

        Popular Naming Convention:
    All caps for key words
        (SELECT, DROP, JOIN)
    lowercase with underscores for tables, and variables
        names_are_lowercase
        media_types
        playlists
    (The provided DB disagrees in this regard)

~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
             Table Structure.
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
A table has several columns which contain data of only one data type
Let's take a look at the chinook database provided in Canvas.

    table_name
        column_name_1
            value, value, value
        column_name_2
            value, value, value


~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
    Important Keywords for Basic SQL
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
Information about important keywords can be found online:
Useful Resource: https://www.w3schools.com/sql/

    CREATE 
        - this command is used to ....

        TABLE table_name  
            - used for making updates to table_name.

    SELECT column(s) FROM table_name;
        - used to take a set of columns from a table.
    
    SELECT DISTINCT ...
        - same as above, but limits only to unique rows.

    WHERE
        - added after a select command, to provide a boolean.
        - can limit the amount of rows which are selected.
        AND
        OR
        NOT
        =
            - Logical operators for declaring a boolean
            - equal sign is to check for equality.
    
    ORDER BY column_name ASC/DESC, ...
        - used to order list by a column
        - ASC for ascending order, and DESC for descending.

    INSERT INTO table_name (and optionally:) (column_name, ...)
    VALUES (value1, value2, value3, ...);
        - used to add a row into a column of a table.
        - you may determine which columns
            - unfilled columns will be left as null.

~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
    Keys
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -



~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
    Creating a table example
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
    CREATE TABLE table_name (
        column_name_1 datatype,
        column_name_2 datatype,
        column_name_3 datatype
    )

~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
    Selecting Data examples
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
SELECT * FROM media_type;

SELECT Name From media_type;

SELECT BillingAddress FROM invoices
WHERE CustomerId = '1';

// How should we change the code above?

~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
    SQL Two, Relational Databases (which SQL is)
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -

Sort these:
student - (academic) record
teacher - student
student - teacher (what's the difference)
doctor - patient
parent - child
customer - work_order
customer - insurance_info

One to One:
"has a"

One to Many:
"has many"

~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
        Primary Key and Foreign Key (SQL: PRIMARY KEY)
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
CREATE TABLE teachers
(
    teacher_id INT PRIMARY KEY,
    first_name TEXT,
    last_name TEXT,
)

CREATE TABLE students
(
	student_id INT PRIMARY KEY,
	first_name TEXT,
	last_name TEXT,
	gpa REAL,
	teacher_id INT
);


INSERT into teachers
VALUES (0, "Thomas", "Wolf");

INSERT into teachers
VALUES (1, "Jay", "Mansmann");

*/
//Java code:
public static String studentsAsSQL(){
    StringBuilder sqlSB= new StringBuilder();

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
        int id = 0;
        for (String[] strings : studentNames) {
            String firstName = strings[0];
            String lastName = strings[1];
            double gpa = ((int) (Math.random()*5000.0))/1000.0;
            int teacher_id = (int)(Math.random()*2);
            sqlSB.append("INSERT INTO students\n" +
                        "VALUES(" + id++ + "," +
                        "\"" + firstName +"\"," +
                        "\""+lastName+"\"," +
                        gpa + ", " + 
                        teacher_id + ");\n");
        }
        return sqlSB.toString();
}

/*

~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
        Foreign Key
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -




SELECT * FROM artists, albums, tracks, genres
WHERE artists.ArtistId = albums.AlbumId
AND albums.AlbumId = tracks.AlbumId
AND tracks.GenreId = genres.GenreId;

SELECT DISTINCT artists.Name as BandName, a.Title as AlbumName, g.Name as Genre
FROM artists
JOIN albums as a
ON a.ArtistId=artists.ArtistId
JOIN tracks as t
ON a.AlbumId=t.AlbumId
JOIN genres as g
ON t.GenreId=g.GenreId
ORDER BY AlbumName;


~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
End of SQL Comments
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -*/
}