package chapter5;
import java.util.Scanner;
/*Write a method that asks a user for their name, then greets them by name
 *
 */

public class c5_methods {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name? ");
        String st = scanner.next();

        greet(st);
    }
        public static void greet(String st){
            System.out.println("Hi there "+ st);
    }

}
