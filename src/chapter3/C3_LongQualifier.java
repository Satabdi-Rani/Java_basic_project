package chapter3;
//Nested if Statement
import java.util.Scanner;
//To qualify for a loan, a person must make at least $30,000 and have been working at their current job
// for at least 2 years

public class C3_LongQualifier {
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
        if(earn >=requiredSalary){
            if(years>= requiredYears){
                System.out.println("Congrats! You qualified for loan");
            }
            else{
                System.out.println("Sorry! You need at least"+ requiredYears + "years experience.");
            }
        }
        else{
            System.out.println("Sorry! Your earning should be $"+ requiredSalary + "or more");
        }

    }
}
