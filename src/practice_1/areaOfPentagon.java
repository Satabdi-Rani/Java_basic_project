package practice_1;

import java.util.Scanner;

public class areaOfPentagon {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value for Perimeter: ");
        double perimeter = scanner.nextDouble();

        System.out.println("Enter a value for Apothem: ");
        double apothem = scanner.nextDouble();

        double area =  0.5 * perimeter * apothem;
        System.out.println("Area of pentagon is : "+ area);
    }
}
