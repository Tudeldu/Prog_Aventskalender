package Prog_Aventskalender;

public class PresentCompare {
    /*
     * Compares two Strings, returns 1 if present1 is greater than present2, -1 if
     * present1 is less than present2, 0 if they are equal
     */
    public static int Compare(ChristmasPresent present1, ChristmasPresent present2) {
        for (int i = 0; i < Math.min(present1.getPresent().length(), present2.getPresent().length()); i++) {
            if (charToInt(present1.getPresent().charAt(i)) > charToInt(present2.getPresent().charAt(i))) {
                return 1;
            } else if (charToInt(present1.getPresent().charAt(i)) < charToInt(present2.getPresent().charAt(i))) {
                return -1;
            }
        }
        if (present1.getPresent().length() < present2.getPresent().length()) {
            return -1;
        } else if (present1.getPresent().length() > present2.getPresent().length()) {
            return 1;
        }
        return 0;
    }

    private static int charToInt(char c) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzöüäABCDEFGHIJKLMNOPQRSTUVWXYZÖÜÄ +-*/=()[]{}.,;:!?0123456789";
        for (int i = 0; i < alphabet.length(); i++) {
            if (alphabet.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public  static String drawTree(ChristmasTree tree){
        String output = "\\**/";
        int height = tree.getHeigth();
        int spaces = height*2;
        int baseSpaces = spaces;
        for(int i=0; i<spaces/2-1; i++){
            output = " "+output;
        }

        for(int i=1; i<height+1; i++){
            output += "\n";
            output += getLayer(i,spaces);
            spaces -= 2;
        }
        output += "\n";
        for(int i=0; i<baseSpaces/2; i++){
            output += " ";
        }
        output += "||";
        return output;
    }

    private static String getLayer(int size, int spaces){
        String output = "";
        int sp=spaces/2;
        for(int i=0; i<sp; i++){
            output += " ";
        }
        for(int i=0; i<size; i++){
            output += "/";
        }
        for(int i=0; i<size; i++){
            output += "\\";
        }
        return output;
    }

}
