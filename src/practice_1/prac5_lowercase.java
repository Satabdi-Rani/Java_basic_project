package practice_1;
import java.util.Scanner;
/* 5. Write a Java program to convert a given string into lowercase.
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
the quick brown fox jumps over the lazy dog.
* */
public class prac5_lowercase {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //Given string
        String string = new String("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");

        //Output to lower string
        System.out.println(string.toLowerCase());

    }
}
