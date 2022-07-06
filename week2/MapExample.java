import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        
        // { (keys) (values)
        //    1:     Oscar
        //    3:     Thomas
        //    2:     Jay
        // }
        HashMap<String, String[]> students = new HashMap<>();
        String[] dermatologists = {"Thomas", "Jay", "A real doctor"};
        students.put("Dermatology", dermatologists);
        System.out.println(students.get("Dermatology")[2]);

    }
}
