package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        double getMiles;
        double getGallons;
        double MPG;
        Scanner in;

        in = new Scanner(System.in);

        System.out.print("How many miles did you drive? ");
        getMiles =in.nextDouble();
        System.out.print("How many gallons did your car consume? ");
        getGallons =in.nextDouble();

        MPG = getMiles /getGallons;

        System.out.println("Your car's Miles Per Gallon is "+MPG);
    }
}
