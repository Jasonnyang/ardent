package lesson2;

import java.util.Scanner;

public class Quadratic{
   public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter a value for a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter a value for b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter a value for c: ");
        double c = input.nextDouble();
        
        double x1 = ( -b + Math.sqrt((b*b) - (4*a*c))) / (2*a);
        double x2 = ( -b - Math.sqrt((b*b) - (4*a*c))) / (2*a);
        
        System.out.println("The answer is " + x1 +" and "+ x2);
    }
}
