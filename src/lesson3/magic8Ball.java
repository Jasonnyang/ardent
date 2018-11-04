package lesson3;


import java.util.Random;
import java.util.Scanner;

public class magic8Ball {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Random gen = new Random();
        
        System.out.println("Magic 8 Ball!");
        System.out.print("Enter a yes/no question:");
        String question = input.next();
        
        int max = 5;
        int min = 1;
        
        int number = gen.nextInt((max-min) + 1) + min;
        
         if( number == 1 ) {
        System.out.println("Definitely not.");
    }   
        else if( number == 2 ) {
        System.out.println("Most probably maybe.");
    }   
        else if( number == 3 ) {
        System.out.println("Signs point to yes.");
    }   
        else if( number == 4 ) {
        System.out.println("Unclear at this time. ");
    }   
        else {
        System.out.println("Absolutely");   
    }
    }
}