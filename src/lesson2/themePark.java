package lesson2;

import java.util.Scanner;

public class themePark{
   public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        if( age <= 3 ) {
        System.out.println("Free Admission!");
    }   
        else if( age < 10 ) {
        System.out.println("$200 Admission!");
    }   
        else if( age < 65 ) {
        System.out.println("$500 Admission!");
    }   
        else if( age < 100 ) {
        System.out.println("$250 Admission!");
    }   
        else 
        System.out.println("Free Admission!");   
    }
}