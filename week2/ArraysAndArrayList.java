// package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        String oneOfThem = interns[0];

        // Set
        interns[0] = "something different";
        // Perform action on each
        for (String intern : interns) {
            System.out.println(intern);
        }

        // Print
        // Add new element
        // interns = new String[6];
        // for(int i = 0; i < interns.length; i++) {
        //     // interns[i]
        // }

        // Complain loudly about inconvenience

        // Refactor to use ArrayList<String>
        List<String> internList = new ArrayList<>(); //<String> is a type parameter
        for (String intern : interns) {
            internList.add(intern);
        }
    
        System.out.println(interns);
        System.out.println(internList);

        Intern conner = new Intern("Conner Gleason", 30);
        Intern jay = new Intern("Jay Mansmann", 30);
        Intern sabrina = new Intern("Sabrina C", 29);
        List<Intern> internObjectList = new ArrayList<>();
        internObjectList.add(conner);
        internObjectList.add(jay);
        internObjectList.add(sabrina);
        // System.out.println(internObjectList);
        // System.out.println(sabrina);
        // System.out.println(sabrina.greeting());
        // System.out.println(conner.greeting());
        // System.out.println(conner.getAge() + sabrina.getAge());

        // Access
        // System.out.println( internObjectList.get(0));
        // Set
        internObjectList.set(0, new Intern("Abdella", 22));
        // Perform action on each
        internObjectList.add(null);
        for (Intern intern : internObjectList) {
            System.out.println(intern);
        }
        // Add new element
        internObjectList.add(new Intern("Paxton", 23));
        // Remove element
        internObjectList.remove(sabrina);
        System.out.println(internObjectList); // Abdella, Jay, Paxton, null
        // Check if list contains an element
        boolean isHeThere = internObjectList.contains(new Intern("Paxton", 23));
        System.out.println(conner.equals(new Intern("Conner Gleason", 31)));
        System.out.println(isHeThere);
        // Clear list
        internObjectList.clear();
        System.out.println(internObjectList);
        // isEmpty
        System.out.println(internObjectList.isEmpty());
        
        // Celebrate
    }
}  

class Intern {
    private String name;
    private int age;
    
    public Intern(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String greeting() {
        return "Hi I'm " + name;
    }
    @Override
    public String toString() {
        return "Intern [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Intern other = (Intern) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    


    
    
    
}

/**
 * Goals
 * -Can instantiate a HashMap<K,V>
 * -Can put/get from a Map
 */
class SimpleHashMapPractice {
    // Inspired by a true story
    public Map<String, String> computerToDeveloperMap;
    public SimpleHashMapPractice() {
        this.computerToDeveloperMap = new HashMap<>();
        computerToDeveloperMap.put("C123", "Jay");
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
            SimpleHashMapPractice practice = new SimpleHashMapPractice();
            String human = practice.computerToDeveloperMap.get(computerThatLockedDevDatabase);
            System.out.println("The problematic human is " + human);

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