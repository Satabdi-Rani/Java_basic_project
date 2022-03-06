package chapter2;

import java.util.Scanner;

public class Season {
    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = scanner.nextInt();
        //scanner.nextLine();

        System.out.println("What is the season going on now?: ");
        String season = scanner.next();

        System.out.println("How is the day?: ");
        String adje = scanner.next();





        System.out.println("On a " +adje+ season + " day, I drink a minimum of " +number+ "cups of coffee");


    }
}
