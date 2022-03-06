package chapter3;
//If Else If statements
import java.util.Scanner;

//Display a letter grade for a student based on their test score.

public class C4_TestResults {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //-----------------Input--------------------
        System.out.println("Whats your score? ");
        double score = scanner.nextInt();

        //----------------Determine the grade---------------
        char grade;

        if(score<60){
            grade ='F';
        }
        else if(score <70){
            grade = 'D';
        }
        else if(score<80){
            grade = 'C';
        }
        else if(score<90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your score is "+grade);
    }
}
