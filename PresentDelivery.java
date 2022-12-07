package Prog_Aventskalender;

public class PresentDelivery {
    private final ChristmasTree tree;
    private final ChristmasPresent[] presents;

    public static void main(String[] args) {
        ChristmasPresent[] tmp = new ChristmasPresent[8];
        for(int i=0;i<8;i++){
            tmp[i] = new ChristmasPresent("Present"+i);
        }
        PresentDelivery delivery = new PresentDelivery(new ChristmasTree(), tmp);
        delivery.getTree().MakeTree(20);
        // for(int i=0;i<8;i++){
        //     delivery.getTree().addPressent(tmp[i]);
        // }
        // delivery.getTree().printPresents();

        System.out.println(PresentCompare.drawTree(delivery.getTree()));
    }

    public PresentDelivery(ChristmasTree tree, ChristmasPresent[] presents) {
        this.tree = tree;
        this.presents = presents;
    }

    public ChristmasTree getTree() {
        return tree;
    }

    public void deliverPresents(ChristmasPresent[] presents) {
        // TODO
    }
}
