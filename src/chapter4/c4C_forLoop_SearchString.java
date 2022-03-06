package chapter4;
//For Loop
import java.util.Scanner;
//Search a string to determine if it contains the letter 'A'
public class c4C_forLoop_SearchString {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //-----------Input--------------
        System.out.println("Enter some text: ");
        String string = scanner.next();

        boolean letterfound = false;

        for(int i = 0; i<string.length(); i++){
             char current = string.charAt(i);
             if( current == 'A' || current == 'a'){
                 letterfound = true;
                 break;
             }
        }
        if(letterfound){
            System.out.println("This text contains A ");
        }
        else{
            System.out.println("This text doesn't contains A ");
        }

    }
}
