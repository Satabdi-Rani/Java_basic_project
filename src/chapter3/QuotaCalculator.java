package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        int quota = 10;

        System.out.println("How many sales?:");
        int sales = scanner.nextInt();

        if(sales>= quota){
            System.out.println("Well Done");
        }
        else{
            int salesshort = quota- sales;
            System.out.println("You were "+ salesshort+"number of short");
        }
    }
}
