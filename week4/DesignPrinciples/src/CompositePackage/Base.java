package CompositePackage;

import java.util.ArrayList;
import java.util.List;

public class Base implements TreePart {
    private TreePart trunk;
    public Base(){
        List<TreePart> branches = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            List<TreePart> growths = new ArrayList<>();
            TreePart newLeaf = new Leaf(j);
            growths.add(newLeaf);
            Branch newBranch = new Branch(growths);
            branches.add(newBranch);
        }
        //and an extra branch without a leaf
        List<TreePart> leaves = new ArrayList<>();
        branches.add(new Branch(leaves));

        trunk = new Trunk(branches);
    }
    @Override
    public void wind() {
        System.out.println("\\----/I am the base of the tree I don't move I never flee.");
        trunk.wind();
    }
}
