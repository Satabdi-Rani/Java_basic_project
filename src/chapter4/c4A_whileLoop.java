package chapter4;
//while loop
import java.util.Scanner;
// Each store employee makes $15 an hour. Write a program that allows a manage to enter the number of
// weekly hours worked for each employee, and calculate their pay. Donot allow for overtime.
public class c4A_whileLoop {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        //--------------------Given values--------------------
        int rate = 15;
        int maxHours = 40;

        //Get input
        System.out.println("How many hours you worked? : ");
        double hoursWorked = scanner.nextInt();

        //Validate Input
        while(hoursWorked> maxHours || hoursWorked<1){
            System.out.println("Invalid!! Try again ");
            hoursWorked = scanner.nextInt();
        }
        double gross = rate * hoursWorked;
        System.out.println("Result : " + gross
        );
    }
}
