import java.io.PipedReader;
import java.util.*;

public class collectionsRunner {
    public static void main(String[] args) {
        Collection<String> myCollection;
        // What is this interface
        // ...What can we expect from myCollection

        //myCollection.
        /*
int     size():             Returns the total number of elements the collection.
boolean isEmpty():          Returns true if the collection contains no elements.
boolean contains(Object o): Returns true if the collection contains the object specified as the argument.
boolean add(E e):           Adds an element to the collection. It returns true if the element was added
                              successfully, else it returns false.
boolean remove(Object o):   Removes one instance of the specified element.
boolean removeAll(Collection<?> collection):
                            Removes all elements from the current collection that are also present
                            in the collection provided as the argument.
        addAll(Collection<?> collection):
                            Adds all the elements in the specified collection
                            to this collection
void    clear(): Removes all elements from the collection.
         */

        //ArrayList
        myCollection = new ArrayList();

        myCollection.add("Hello");
        myCollection.add(" world!\n");

//        Collection<String> extraCollection = new LinkedList();
//        extraCollection.add(" world!\n");
//        myCollection.addAll(extraCollection);

        myCollection.forEach((s) -> System.out.print(s));


        //// Linked List
//        Collection myList = new LinkedList<>();
//        myList.add("one ");
//        myList.add("two ");
//        myList.add("three ");
//
//        myList.forEach((s) -> System.out.print(s));

        //// While my Collection is NOT empty, let's remove a member and print the list.
//        int count = 0;
//        while (!myList.isEmpty() && count++ < 100) {
//            System.out.println("\nRemoving:" + myList.remove(0));
//
//            myList.forEach((s) -> System.out.println(s));

        ////Priority Queue
        PriorityQueue<Person> myQueue = new PriorityQueue<Person>();
        }


    class Person {
        private String name;
        private int value;

        Person(String name, int value){
            this.name = name;
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
    }
    
}
