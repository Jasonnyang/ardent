package lesson1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        //Prompt the user to enter their name
        System.out.print("Please enter your name:");
        
        //get the user's name from the command line input
        String name = input.next();
        
        //print out a custom greeting
        System.out.println("Hello, " + name + "!");
    }
}    