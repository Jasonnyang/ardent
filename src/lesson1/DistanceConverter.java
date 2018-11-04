package lesson1;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        //Prompt the user for a distance in miles
        System.out.print("Enter a distance in miles: ");
        double miles = input.nextDouble();
        
        //Convert the distance from miles to kilometers
        double kilometers = miles * 1.6;
        
        //print out the results
        System.out.println("The equivalent distance in kilometers is: " + kilometers);
    }
}    