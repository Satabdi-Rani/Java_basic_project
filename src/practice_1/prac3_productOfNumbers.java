package practice_1;
import java.util.Scanner;
/*  3. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
* */
public class prac3_productOfNumbers {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //Taking input
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        //product of Two Numbers
        double product = num1 * num2;
        System.out.println("product is: " + product);
    }
}
