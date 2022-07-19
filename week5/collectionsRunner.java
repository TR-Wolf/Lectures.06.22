import java.util.*;

public class CollectionsRunner {
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

        ////Priority Queue (goto Person first)
//        PriorityQueue<Person> emergencyRoomQueue = new PriorityQueue<>();
//
//        emergencyRoomQueue.add(new Person("Caspoor", -5));
//        emergencyRoomQueue.add(new Person("Joe", 4));
//        emergencyRoomQueue.add(new Person("George", 4));
//
//        //Who get's to leave first?
//        Person personInNeed = emergencyRoomQueue.remove();
//        personInNeed.admit();
//
//        //and second?
//        personInNeed = emergencyRoomQueue.remove();
//        personInNeed.admit();

        ////Let's add a few billionaires, and Thomas
//        emergencyRoomQueue.add(new Person("Jeffrey Bezos", (136.3 * Math.pow(10, 6)))); // 136 Billion
//        emergencyRoomQueue.add(new Person("Elon Musk", (229.1 * Math.pow(10, 6)))); //229 billion
//        emergencyRoomQueue.add(new Person("Thomas Wolf", 20));
//        System.out.println("Billionaires (and Thomas) have walked into the ER waiting room.");
//
//        personInNeed = emergencyRoomQueue.remove();
//        personInNeed.admit(); //who?
//
//        personInNeed = emergencyRoomQueue.remove();
//        personInNeed.admit();
//
//
//        personInNeed = emergencyRoomQueue.remove();
//        personInNeed.admit();

        //// Tree Set
        TreeSet<Person> hospitalPatientsSet = new TreeSet<>();

        //let's use the same 6 patients
        hospitalPatientsSet.add(new Person("Caspoor", -5));
        hospitalPatientsSet.add(new Person("Joe", 4));
        hospitalPatientsSet.add(new Person("George", 4));
        hospitalPatientsSet.add(new Person("Jeffrey Bezos", (136.3 * Math.pow(10, 6)))); // 136 Billion
        hospitalPatientsSet.add(new Person("Elon Musk", (229.1 * Math.pow(10, 6)))); //229 billion
        hospitalPatientsSet.add(new Person("Thomas Wolf", 20));

        Person first = hospitalPatientsSet.first();
        System.out.println(first.toString() + " will be seen first today.");

        Person last = hospitalPatientsSet.last();
        System.out.println(last.toString() + " will be seen last today.");

        //// Let's try: range(l,u), headset(#) and tailset(#) (smaller and larger)



    }


    static class Person implements Comparable {
        private String name;
        //my Networth in thousands
        private double netWorth;

        Person(String name, double netWorth){
            this.name = name;
            this.netWorth = netWorth;
        }
        public double getNetWorth() {
            return this.netWorth;
        }
        public void admit(){
            System.out.println(this.name + " is to admitted to the ER.");
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public int compareTo(Object o) {
            // We want to consider this as a person, not as an object.
            Person otherPerson = (Person)o;
            // Do I have a larger net worth? How much bigger is my net worth?
            return (int) (otherPerson.getNetWorth() - this.netWorth);
        }
    }
    
}
