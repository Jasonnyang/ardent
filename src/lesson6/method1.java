package lesson6;

import java.util.Scanner;

public class method1 {
    public static void print( String s ) {
        System.out.print (s);
    }
    public static void println( String s ) {
        System.out.println (s);
    }
    
    //Convert miles to kilometers
    public static double distanceConvert( double miles ) {
        double kilometers = miles * 1.6;
        return kilometers;
    }
    
    //Convert parsecs to light years
    public static double ParasecConvert (double parsecs) {
    double lightyears = parsecs * 3.26;
    return lightyears;
}   
    
//Calculate the total cost of a purchase
    public static double totalPrice ( double cost, double taxPercentage) {
        double tax = taxPercentage / 100.0;
        double total = cost * (1 + tax);
        return total;
    }
    
//Write a method that accepts an array of integers and a multiplier value
//Multiply each integer in the array by the multiplier value
//Return a new array with the new values
    public static int[] multArray( int[] nums, int mult ) {
    int [] results = new int [nums.length];
    
        for ( int i = 0; i < nums.length; i++) {
        results [i] = nums[i] * mult;
        }
        
        return results;
    }   
    
    public static void main ( String[] args ){
        //convert miles to kilometers
        Scanner input = new Scanner( System.in );
        System.out.print( "Enter distance in miles: ");
        double mi = input.nextDouble();
        double km = distanceConvert( mi );
        System.out.println( "The equivalent distance in kilometers is: " + km );
        
        //convert parasecs to light years
        print("Enter a distance in parsecs: ");
        double parsecs = input.nextDouble();
        double lightyears = ParasecConvert( parsecs );
        println("The equivalent distance in light-years is: " + lightyears);
        
        //Calculate the total cost of a purchase
        print("Enter the price of your purchase ");
        double cost = input.nextDouble();
        print("Enter the tax for your purchase ");
        double taxPercentage = input.nextDouble();
        double totalPrice = totalPrice( cost, taxPercentage );
        println("The total cost is: " + totalPrice);
        
        //test the array mult 
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        println( "Original array: ");
        for ( int i = 0; i < nums.length; i++ ) {
            print( nums[ i ] + " " );
        }
        println(" ");
        print( "Enter an integer multiplier: ");
        int m = input.nextInt();
        int[] newNums = multArray( nums, m );
        println( "New Array: ");
        for ( int i = 0; i < nums.length; i++ ) {
            print( newNums[i] + " " );
        }
        
    }
    }