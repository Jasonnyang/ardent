package lesson4;

public class Loopy {
 public static void main( String[] args ) {
     //Loop control variable
     int counter = 1;
     
     //While loop and condition
     while ( counter <= 10) {
         System.out.print( counter + " ");
         
         //increment
         counter++;
        }
        
     System.out.println();
     
     //lcv
     counter = 10;
     
     //loop
     while ( counter > 0 ) {
         //decrement
         counter = counter-1;
         //counter -=1
         //counter--;
        }
        
          System.out.println();
        
          //for : lcv, condition, increment
          for (int i = 1; i<=10; i++) {
              System.out.print ( i + " ");
            }
            
          for (int i = 10; i>0; i--) {
              System.out.print ( i + " ");
            }
    }
}
