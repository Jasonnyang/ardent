package lesson3;


import java.util.Random;
import java.util.Scanner;

public class magic8BallSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Random gen = new Random();
        
        System.out.println("Magic 8 Ball!");
        System.out.print("Enter a yes/no question:");
        String question = input.next();
        
        int max = 5;
        int min = 1;
        
        int number = gen.nextInt((max-min) + 1) + min;
        
         switch ( number ){
             case 1: System.out.println( "Yes!");
             break;
             case 2: System.out.println( "No!");
             break;
             case 3: System.out.println( "Maybe");
             break;
             case 4: System.out.println( "Ur bad");
             break;
    }
}
}