public class SQLBasics {
    public static void main(String[] args) {
        System.out.println("I love SQL");
    }
    /*
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -
           Structured Query Language SQL
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -

    Statements end in semicolon;

    Language is not case sensitive.

        Popular Naming Convention:
    All caps for key words
        (SELECT, DROP, JOIN, UPDATE)
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

    CREATE TABLE new_table;
        
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
            - HAPPY AND SAD
            - (not 30 or 29)
            - NOT ((age = 30) OR (AGE = 29));
    
    ORDER BY column_name ASC/DESC, ...
        - used to order list by a column
        - ASC for ascending order, and DESC for descending.

    INSERT INTO table_name (and optionally:) (column_name, ...)
    VALUES (value1, value2, value3, ...);
        - used to add a row into a column of a table.
        - you may determine which columns
            - unfilled columns will be left as null.

    UPDATE
    
    DELETE

    DROP

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
End of SQL Comments
~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ - ~ -*/
}