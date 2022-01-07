package exercises.Lesson1;

import java.util.Scanner;

public class AvgMpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven:");
        double miles = input.nextDouble();
        System.out.println("Gasoline used(gal):");
        double gallons = input.nextDouble();
        double mpg = miles / gallons;
        System.out.println("Your average miles per gallon is " + mpg);
    }
}
