package lesson5;

import java.lang.Math;
public class MethodPractice
{
   //write a method that performs currency exchange between GBP and USD
   public static void main ( String[] args ){
   }
   public static double Convert(double GBP )
   {
       double USD = GBP * 1.31142;
       return USD;
    //main function
    }
    public static boolean Leap (int year ) {
       if (year % 400 == 0) {
           return true;
        }
       else if (year % 100 == 0) {
           return false;
        }
       else if (year % 4 == 0) {
            return true;
        }
       else return false;
    }
    public static double Quadratic(double a, double b, double c) {

        double x1 = ( -b + Math.sqrt((b*b) - (4*a*c))) / (2*a);      
        return x1;
        
    }
    public static double Quadratic2(double a, double b, double c) {

        double x2 = ( -b - Math.sqrt((b*b) - (4*a*c))) / (2*a);
        
        return x2;
        
    }
}
