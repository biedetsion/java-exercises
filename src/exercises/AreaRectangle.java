package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
        double myWidth;
        double myLength;
        double area;
        Scanner in;

        in = new Scanner(System.in);

        System.out.print("What is the width of your rectangle? ");
        myWidth = in.nextDouble();
        System.out.print("What is the length of your rectangle? ");
        myLength = in.nextDouble();

        area = myWidth * myLength;

        System.out.println("The area of your rectangle is " + area);
    }
}