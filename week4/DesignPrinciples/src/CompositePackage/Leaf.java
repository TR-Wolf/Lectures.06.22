package CompositePackage;

public class Leaf implements TreePart {
    private String leafPoem;
    public Leaf(int num) {
        leafPoem = "  ||    I am the leaf. My life is brief.\n";
        switch (num%3){
            case 0:
                leafPoem += "  / \\    I say goodbye to my tree as the wind flows.\n  \\ /    My Corpse in its cool clutch, the wind now controls.\n";
                break;
            case 1:
                leafPoem += "  / \\    The wind tugs and pulls,\n  \\ /    and we often keep our souls.\n";
                break;
            case 2:
                leafPoem += "  / \\    The wind tosses and it throws,\n  \\ /    but around me it flows.\n";
                break;
        }
    }

    @Override
    public void wind() {
        System.out.print(leafPoem);
    }
}
