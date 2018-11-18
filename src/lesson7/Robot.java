package lesson7;

import java.util.Random;

public class Robot {
	String Name = "John";
	int age = 32;
	String color = "blue";
	
	public static String RandomGreet() {
		int max = 4;
        int min = 1;
        
        Random gen = new Random();
        int number = gen.nextInt((max-min) + 1) + min;
        
         if( number == 1 ) {
        System.out.println("Hey");
    }   
        else if( number == 2 ) {
        System.out.println("Good morning");
    }   
        else if( number == 3 ) {
        System.out.println("What's up");
    }   
        else {
        System.out.println("Nice to meet you");   
    }
	}
	
	public static String RandomMood() {
		int max = 6;
        int min = 1;
        
        Random gen = new Random();
        int number = gen.nextInt((max-min) + 1) + min;
        
         if( number == 1 ) {
        System.out.println("Happy");
    }   
        else if( number == 2 ) {
        System.out.println("Sad");
    }   
        else if( number == 3 ) {
        System.out.println("Angry");
    }  
        else if( number == 4 ) {
             System.out.println("Depressed");
    }   
        else if( number == 5 ) {
             System.out.println("Psychotic");
    }  
        else {
        System.out.println("Apethetic");   
    }
	}
	
	public static void main (String [] args) {
		System.out.println (Name);
		System.out.println (age);
		
		System.out.println ("Pew Pew Pew");
	}
}
