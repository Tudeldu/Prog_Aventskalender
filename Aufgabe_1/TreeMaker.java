package Prog_Aventskalender.Aufgabe_1;

import java.util.Scanner;

public class TreeMaker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Geben Sie die Höhe des Baumes ein:");
        int height=sc.nextInt();
        sc.close();
        System.out.println(drawTree(height));
    }
    public  static String drawTree(int height_){
        String output = "XX";
        int height = height_;
        int spaces = height*2;
        int baseSpaces = spaces;
        for(int i=0; i<spaces/2; i++){
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
