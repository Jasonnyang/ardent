package lesson1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter a temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius = (fahrenheit - 32.0) * 5.0/9.0;
        
        System.out.println("The equivalent temperature in celsius is: " + celsius);
    }
}    