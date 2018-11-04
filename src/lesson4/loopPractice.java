package lesson4;

public class loopPractice {
 public static void main( String[] args ) {
     //Loop control variable
     int counter = 1;
     
     //While loop and condition
     while ( counter <= 12) {
         System.out.print( counter*7 + " ");
         
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
          for (int i = 1; i<=33; i++) {
              System.out.print ( i*3 + " ");
            }
            
     System.out.println();
            
          for (int i = 33; i>0; i--) {
              System.out.print ( i*3 + " ");
            }
    }
}
