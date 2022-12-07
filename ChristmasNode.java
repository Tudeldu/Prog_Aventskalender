package Prog_Aventskalender;

public class ChristmasNode {
    private ChristmasNode left;
    private ChristmasNode right;

    public ChristmasNode() {
        left = null;
        right = null;
    }

    public ChristmasNode getLeft() {
        return left;
    }

    public void setLeft(ChristmasNode left) {
        this.left = left;
    }

    public ChristmasNode getRight() {
        return right;
    }

    public void setRight(ChristmasNode right) {
        this.right = right;
    }

    public void MakeTree(int height) {
        if (height == 0) {
            return;
        }
        if (left == null) {
            left = new ChristmasNode();
        }
        if (right == null) {
            right = new ChristmasNode();
        }
        left.MakeTree(height - 1);
        right.MakeTree(height - 1);
    }

    public int getHeigth() {
        if (left == null) {
            return 0;
        }
        return left.getHeigth() + 1;
    }

    public void addPressent(ChristmasPresent present) {
        if (left != null) {
            if (!!left.isFilled()) {
                left.addPressent(present);
            } else if (right != null) {
                if (!right.isFilled()) {
                    right.addPressent(present);
                }
            }
        } else if (left == null) {
            left = present;
        } else if (right == null) {
            right = present;
        }

    }

    public boolean isFilled() {
        if (left == null || right == null) {
            return false;
        } else if (left instanceof ChristmasPresent && right instanceof ChristmasPresent) {
            return true;
        }
        return left.isFilled() && right.isFilled();
    }
}
