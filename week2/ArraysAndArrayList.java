import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Goals
 * -Understand why arrays aren't a great experience
 * -Understand why to use List interface as variable type
 * -Can remember most of the important List methods
 */
public class ArraysAndArrayList {
    public static void main(String[] args) {
        String[] interns = {"Ella", "Stephen", "Tyler", "Tristan", "Alyssa"};
        // Access
        // Set
        // Perform action on each
        // Print
        // Add new element
        // Complain loudly about inconvenience
        // Refactor to use ArrayList<String>
        // Access
        // Set
        // Perform action on each
        // Add new element
        // Remove element
        // Check if list contains an element
        // Clear list
        // isEmpty
        // Celebrate
    }
}  

/**
 * Goals
 * -Can instantiate a HashMap<K,V>
 * -Can put/get from a Map
 */
class SimpleHashMapPractice {
    // Inspired by a true story
    private Map<String, String> computerToDeveloperMap;
    public SimpleHashMapPractice() {
        this.computerToDeveloperMap = new HashMap<>();
        computerToDeveloperMap.put("C123", "Jay");
        computerToDeveloperMap.put("C124", "JaVonne");
        computerToDeveloperMap.put("C124", "JaVonne");
        computerToDeveloperMap.put("C125", "Joe");
        computerToDeveloperMap.put("C126", "Ali");
        computerToDeveloperMap.put("C127", "Andrea");
    } 
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Which computer is the problem?");
            String computerThatLockedDevDatabase = scanner.nextLine();
            System.out.println("The problematic computer is " + computerThatLockedDevDatabase);
            // How do I use my map to find the problematic human?
            System.out.println("The problematic human is ");

        }


    }

   
}

/**
 * Goals
 * -Can understand why maps are useful
 */
class HashMapPractice {
    public static void main(String[] args) {
        // Get a long String
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Varius quam quisque id diam. Est pellentesque elit ullamcorper dignissim. Ornare aenean euismod elementum nisi. Arcu cursus euismod quis viverra nibh cras pulvinar. Amet mauris commodo quis imperdiet massa tincidunt nunc. Tincidunt arcu non sodales neque sodales ut etiam sit. Lorem ipsum dolor sit amet consectetur adipiscing elit. Lorem dolor sed viverra ipsum nunc. Id ornare arcu odio ut sem nulla. Elit ut aliquam purus sit amet luctus venenatis lectus magna. Dui faucibus in ornare quam viverra orci sagittis eu. Commodo nulla facilisi nullam vehicula ipsum a arcu. Nibh tellus molestie nunc non. Fermentum posuere urna nec tincidunt praesent semper feugiat nibh. Fames ac turpis egestas sed tempus urna. Cras ornare arcu dui vivamus. Libero volutpat sed cras ornare arcu dui vivamus. Fermentum posuere urna nec tincidunt praesent semper feugiat nibh sed. Sed adipiscing diam donec adipiscing tristique risus nec.";
        // Find most frequently-used letter(s)

    }
}