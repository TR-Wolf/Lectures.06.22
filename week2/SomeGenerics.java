// package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Goals
 * -Recognize generics
 * -Know why they are helpful
 * -Be able to implement a class or method that uses generics
 */
public class SomeGenerics {
    public static void main(String[] args) {
        // Java 1.4 - before generics
        List list = new ArrayList();
        list.add("HI");
        System.out.println(list);
        // list.get(0). // what methods are available?
        // How do I make Java know list.get(0) is a String?
        // What else can I add to this list?

        // Java 1.5+
        List<String> listWithTypeParameters = new ArrayList<>();
        listWithTypeParameters.add("hi");
        // What else can I add to this list?

        // Let's make a CounterService
        // Given a List of whatever,
        // return a map for which each key is an element from the list and the value is the number of times that element appears in the list.
        CounterServiceSolution sampleCounter = new CounterServiceSolution();
        List<String> stringList = Arrays.asList("A", "B", "C", "B");
        Map<String, Integer> result = sampleCounter.toMap(stringList);
        System.out.println(result);
        // Output: {A=1, B=2, C=1}
    }
}












class CounterServiceSolution {
    public <K> Map<K, Integer> toMap(List<K> list) {
        Map<K, Integer> elementToCounter = new HashMap<>();
        for(var element : list) {
            if(elementToCounter.containsKey(element)) {
                elementToCounter.put(element, elementToCounter.get(element) + 1);
            }
            else {
                elementToCounter.put(element, 1);
            }
        }
        return elementToCounter;
    }
}