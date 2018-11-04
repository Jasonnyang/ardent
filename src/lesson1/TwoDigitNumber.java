package lesson1;

import java.util.Scanner; 

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        System.out.print("Enter a two digit number: ");
        int TwoDigit = input.nextInt();
        
        int Ones = TwoDigit % 10;
        int Tens = TwoDigit/10;
        System.out.println("The tens digit is: " + Tens + ", and the ones digit is: " + Ones);
    }
}