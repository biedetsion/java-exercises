package exercises;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What's your name?");
        String myString = input.next();
        System.out.println("Hello " + myString);
    }
}
