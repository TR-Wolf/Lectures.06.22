package CompositePackage;

import java.util.ArrayList;
import java.util.List;

public class Branch implements TreePart {
    List<TreePart> growths = new ArrayList<>();
    private String branchPoem;
    public Branch(List<TreePart> growths) {
        this.growths = growths;
        branchPoem = "\n\\  \\  I am just another branch of the tree\n/  /  and my life isn't short or long, but a spree.\n";
        switch (this.growths.size()) {
            case 0:
                branchPoem += " \\ /  No leaves are with me\n\\ \\/  I am weak as can be\n/ |   The wind comes and goes\n   \\   I easily snap and throw.";
                break;
            case 1:
                branchPoem += "\\  \\  I have a leaf today\n \\ /  I want to know if it will stay....\n";
                break;
            default:
                branchPoem += "\\  |   I do not fret\n/  \\  I have plenty of leaves yet\n";
                break;
        }
    }
    @Override
    public void wind() {
        System.out.print(branchPoem);
        //For each child:
        for (TreePart growth: growths) {
            growth.wind();
        }
    }
}
