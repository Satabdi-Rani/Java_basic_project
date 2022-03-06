package chapter3;
//Logical Operators
import java.util.Scanner;

public class C6_LogicalOperators {
    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);

        //----------------Given values--------------------------------
        int requiredSalary = 30000;
        int requiredYears = 2;

        //----------------Input--------------------------------
        System.out.println("How much you earned?: ");
        double earn = scanner.nextInt();

        System.out.println("How many years you worked?: ");
        double years = scanner.nextInt();

        //----------------Condition Check--------------------------------
        if(earn >=requiredSalary && years>= requiredYears){
                System.out.println("Congrats! You qualified for loan");
            }


        else{
            System.out.println("Sorry! Your earning should be $"+ requiredSalary + "or more");
        }

    }
}
