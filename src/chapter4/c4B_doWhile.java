package chapter4;
//Do While Loop
import java.util.Scanner;
// Write a program that allows a user to enter two numbers and then sums up the two numbers. The user should
//be able to repeat this action until they indicate they are done
public class c4B_doWhile {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
           System.out.println("Enter the first number: ");
           double num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextInt();

            double sum = num1+num2;

            System.out.println("The sum is "+ sum);

            System.out.println("Would like to start again? ");
            again = scanner.nextBoolean();
        }
        while(again);
    }
}
