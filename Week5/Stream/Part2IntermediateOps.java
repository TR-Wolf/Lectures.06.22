import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Part2IntermediateOps {
    /*
     * Goals:
     * Understand the difference between terminal and intermediate operations
     * Memorize the most common intermediate operations (filter, map)
     * Learn how to combine intermediate operations with each other and then end with a terminal operation to achieve goal
     */
    public static void main(String[] args) {
        // What if we have a Stream of Integers?
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, -1);

        // Maybe we want a new List that contains just the odd numbers
        // Easy, but we need to filter out the even numbers
        List<Integer> oddIntList = intList.stream().filter(anIntFromThisList -> anIntFromThisList % 2 != 0).toList();
        // In JS, this would be intList.filter(anIntFromThisList => anIntFromThisList % 2 !== 0);
        // System.out.println("filter(anIntFromThisList -> anIntFromThisList % 2 != 0).toList()::" + oddIntList);

        // Maybe we want a new List that contains just the negative odd numbers?
        List<Integer> negativeOddIntList = intList.stream()
            .filter(anIntFromThisList -> anIntFromThisList % 2 != 0)
            .filter(anOddInt -> anOddInt < 0)
            .toList();
        // System.out.println("negativeOddIntList::" + negativeOddIntList);

        // Maybe we want a new List that contains the square of each int
        // We need to map each int to its square
        List<Integer> squaresOfIntsList = intList.stream().map(anIntFromThisList -> Math.abs(anIntFromThisList)).toList();
        // In JS, this would be intList.map(anIntFromThisList => anIntFromThisList * anIntFromThisList);
        // System.out.println("squaresOfIntsList::" + squaresOfIntsList);

        // Let's sum them up?
        // Must first convert the Integer to an int
        // Sooo we need to use the mapToInt method and put a function in there that converts an Integer to an int.
        // Thennn we can use the .sum() method
        // sum of positive numbers?
        long sum = intList.stream().mapToInt(oneThing -> oneThing).filter(element -> element > 0).sum();
        System.out.println("sum()::" + sum);
     


        // What if you had a List of Lists of Integers?
        // And what if we just wanted one List of all the integers?
        // We need to flatMap them
        List<List<Integer>> listOfListsOfIntegers = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(-1, -3, -5));
        List<Integer> flattenedList = listOfListsOfIntegers.stream().flatMap(aSingleListFromTheBigList -> aSingleListFromTheBigList.stream()).toList();
        // flatMap(a function that returns a Stream) --- this sort of merges all the streams from all the lists together into one big stream
        // in JS, listOfListsOfIntegers.flatMap(aSingleListFromTheBigList => aSingleListFromTheBigList);
        // System.out.println("flattenedList::" + flattenedList);

        
    }
}
