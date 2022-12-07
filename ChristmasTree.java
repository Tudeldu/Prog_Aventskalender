package Prog_Aventskalender;

public class ChristmasTree {
    private final ChristmasNode star;

    public ChristmasTree() {
        star = new ChristmasNode();
    }

    public ChristmasNode getStar() {
        return star;
    }

    // Builds balanced Binary tree with debth height
    public void MakeTree(int height) {
        star.MakeTree(height);
    }

    // Returns the height of the tree
    public int getHeigth() {
        return star.getHeigth();
    }

    public void addPressent(ChristmasPresent present) {
        star.addPressent(present);
    }

}