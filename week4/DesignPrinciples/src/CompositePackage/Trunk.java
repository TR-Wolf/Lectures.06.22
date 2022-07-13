package CompositePackage;

import java.util.ArrayList;
import java.util.List;

public class Trunk implements TreePart {
    List<TreePart> growths = new ArrayList<>();
    public Trunk(List<TreePart> growths) {
        this.growths = growths;
    }
    @Override
    public void wind() {

        System.out.print("\\\\  //I am the trunk of the tree,\n||  ||rarely does the wind affect me.\n");
        for (TreePart part : growths) {
            part.wind();
        }
    }
}
