import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Part1TerminalOps {
    /*
     * Goals:
     * Learn how to "open" a stream
     * Become familiar with the most common terminal operations
     */
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "b", "c", "D", "B", "Z", "y");
        
        // Terminal Operations
        //  forEach(consumer function) just runs the given function FOR EACH element in the Stream
        stringList.stream().forEach(aStringFromThisList -> System.out.println(aStringFromThisList));        
        //Consumer - is a function that takes in one parameter and has a void return type
        //  in JS this would be stringList.forEach(aStringFromThisList => console.log(aStringFromThisList));


        //  count() just gives you the number of elements that were in the Stream
        long numberOfElementsInTheStream = stringList.stream().count();
        // System.out.println("count()::" + numberOfElementsInTheStream);

        //  collectors are more interesting. 
        //  Maybe we want to take our stringList and get a String with a new line between each element
        //  .collect(Collectors.joining(some delimiter String)) can take every element in the Stream and turn it into a String with the delimiter between it
        String joinedWithNewLine = stringList.stream().collect(Collectors.joining(","));
        // System.out.println("collect(Collectors.joining(\"\\n\")::" + joinedWithNewLine);

        // Maybe we want to take our stringList and get a Set
        // .collect(Collectors.toSet()) can take every element in the Stream and add it to a Set
        Set<String> stringSet = stringList.stream().collect(Collectors.toSet());
        // System.out.println("collect(Collectors.toSet())::" + stringSet);

        // Maybe we regretted doing that
        // .collect(Collectors.toList()) can take every element in the Stream and add it to a List
        List<String> stringListRemade = stringSet.stream().collect(Collectors.toList());
        // System.out.println("collect(Collectors.toList())::" + stringListRemade);

        // Or maybe we want to do it a bit simpler
        // Java kindly added a .toList terminal operation in Java 16
        List<String> stringListRemade2 = stringSet.stream().toList();
        // System.out.println("toList()::" + stringListRemade);


        // Maybe I want to know if the List only contains "J"
        boolean containsOnlyJ = stringList.stream().allMatch(aString -> aString.equals("J"));

        // Maybe I want to know if the List contains at least one string longer than 5 characters
        boolean containsAStringLongerThan5Characters = stringList.stream().anyMatch(aString -> aString.length() > 5);
        System.out.println(containsAStringLongerThan5Characters);
        boolean containsJ = stringList.stream().anyMatch(aString -> aString.equals("J"));
 

        // There are more terminal operations.
        // Some involve Optionals, though, so stay tuned.
        // Some involve primitives, which is up next.

    }
}
