package lesson7;

import java.util.Scanner;

public class TestShapes
{
   public static void main( String[] args ) 
   {
       Circle c1 = new Circle( 6.28 );
       System.out.println( "This circle has radius: " + c1.getRadius() );
       
       Rectangle box = new Rectangle( 2.0, 4.0 );
       System.out.println( "This rectange has area: " + box.area() );
       
       Scanner input = new Scanner( System.in );
       System.out.print( "Enter the number of sides for this n-gon: ");
       int sides  = input.nextInt();
       
       nGon polly = new nGon( sides, 10 );
       System.out.println ( "The sum of interior angles of this n-gon is : " + polly.Angle() );
   }
}
