package practice_1;

public class arrayValueAverage {
    public static void main (String args[]){
        int[] name = {10, 20, 30};
        int sum=0;
        for (int i=0; i<name.length; i++){
            sum =sum + name[i];

        }
        System.out.println(sum);
    }
}
