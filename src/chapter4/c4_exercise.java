package chapter4;

import java.util.Random;
import java.util.Scanner;

public class c4_exercise {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //Initialize the value
        int spaces = 20;
        int dieRolls = 5;

        Random random = new Random();
        //Generating a random number
        for(int i=0; i<dieRolls; i++) {
            int die = random.nextInt(6)+1;
            System.out.println("die " + die +"  i "+ i );
            for(int j=0; j<spaces; j++){
                int left = spaces - die;
                System.out.println("left" + left );
                break;
            }
//            System.out.println("ypur random " + die );
        }
//            int die = random.nextInt(6)+1;
//            System.out.println("ypur random " + die );
//            int spaceLeft = spaces - die;
//            int travelledSpaces = die
//            System.out.println("you have space left " + spaceLeft );


//        Random random = new Random();
//        int die = random.nextInt(6)+1;
//        System.out.println(die);

    }
}
