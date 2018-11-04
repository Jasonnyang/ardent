package lesson1;

import java.util.Scanner;

public class ParsecsConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter a distance in parsecs: ");
        double parsecs = input.nextDouble();
        
        double lightyears = parsecs * 3.26;
        
        System.out.println("The equivalent distance in light-years is: " + lightyears);
    }
}    