package Prog_Aventskalender;

public class ChristmasPresent extends ChristmasNode {
    private String present;

    public ChristmasPresent(String present) {
        super();
        this.present = present;
    }

    public String getPresent() {
        return present;
    }

    @Override
    public boolean isFilled() {
        return true;
    }

    @Override
    public void addPressent(ChristmasPresent present) {
        return;
    }

    @Override
    public String printPresents() {
        return present;
    }
}
