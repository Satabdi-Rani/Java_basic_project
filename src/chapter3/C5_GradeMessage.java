package chapter3;
//Switch statements
import java.util.Scanner;
//Have a user enter their grade, and using a switch statement, print out a message letting them
//know how they did
public class C5_GradeMessage {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

         //--------------------------input------------------
        System.out.println("Enter your grade: ");
        String grade = scanner.next();

        String message;
        switch(grade){
            case "A":
                message ="Excellent job!";
                break;
            case "B":
                message =" Good job";
                break;
            case "C":
                message =" Good job";
                break;
            case "D":
                message =" Work hard";
                break;
            case "F":
                message =" Sad!";
                break;
            default:
                message =" Invalid";
                break;
        }
        System.out.println(message);
    }
}
