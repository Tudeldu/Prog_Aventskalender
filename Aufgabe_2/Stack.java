package Prog_Aventskalender.Aufgabe_2;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args){
        Stack stack = new Stack(10000);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("command:");
            String input = sc.nextLine();
            if(input.contains("push")){
                System.out.print("type Present name:"+"\n");
                String present = sc.nextLine();
                stack.push(present);
            }else if(input.contains("pop")){
                System.out.print("Present: "+stack.pop()+"\n");
            }else if(input.contains("print")){
                System.out.print(stack.print()+"\n");
            }else if(input.contains("exit")){
                sc.close();
                break;
            }else{
                System.out.print("command unknown, to quit type: exit\n"); 
            }
        }
    }

    private String[] stack;
    private int size;
    private int top;

    public Stack(int size_){
        size = size_;
        stack = new String[size];
        top = 0;
    }

    public void push(String input){
        if(top<size){
            stack[top] = input;
            top++;
        }else{
            System.out.println("stack is full");
        }
    }

    public String pop(){
        if(top>0){
            top--;
            return stack[top];
        }else{
            System.out.println("stack is empty");
            return null;
        }
    }

    public String print(){
        if(top==0){
            return "[]";
        }
        String out="[";
        for(int i=0; i<top-1; i++){
            out += stack[i]+", ";
        }
        out += stack[top-1]+"]";
        return out;
    }
}
