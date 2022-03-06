package chapter4;

import java.util.Scanner;

//Nested Loops
//Find the average of each students test scores
public class c4D_nestedLoops {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //Initialize what we know
        int numberOfStudents = 1;
        int numberOfTests =4;

        //process all students
        for(int i =0; i<numberOfStudents; i++){

            double total =0;
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for test #" +(j+1));
                double score = scanner.nextDouble();
                total = total +score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average for student #" +(i+1)+ " is "+ average);
        }
    }
}
