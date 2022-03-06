package practice_1;
import java.util.Scanner;
/*4. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
**/
public class prac4_multiplication {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);

        //Initialize value
        int upto =10;

        //Taking a input
        System.out.println("Enter a number for multiplication: ");
        int number = scanner.nextInt();

        //Multiplication
        for(int i=1; i<=upto; i++){
            int multi = number * i;
            System.out.println(number + " X " + i + " = " + multi);
        }

    }
}
