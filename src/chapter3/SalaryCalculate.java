package chapter3;

import java.util.Scanner;

public class SalaryCalculate {
    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);

        int salary = 1000;
        int bonus = 250;
        System.out.println("How many sales?:");
        int sales = scanner.nextInt();

        if(sales>10){
            salary = salary + bonus;
            //System.out.println("Your salary is:$" + salary);
        }
        System.out.println("Your salary is:$" + salary);
    }
}
