package ObserverPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parent {
    private HashMap<Child, School> childrenToSchoolingLevel;

    public void addChild(Child child) {
        if (childrenToSchoolingLevel == null) {
            childrenToSchoolingLevel = new HashMap<>();
        }
        childrenToSchoolingLevel.put(child, child.getSchool());
    }

    public void childGraduated(School school, Child child){
        if (childrenToSchoolingLevel.get(child) != null) {
            System.out.println("I am so proud! My child just graduated");
        }
    }


}
