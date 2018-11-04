package lesson3;


import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Random gen = new Random();
        
        //Ask the player for rock, paper, or scissor
        System.out.println( "Rock, paper, scissors");
        System.out.print("Choose 1 for rock, 2 for paper, or 3 for scissors");
        int player = input.nextInt();
        
        //Display the user's throw
        if( player < 1 || player > 3) {
        System.out.println("Invalid input detected. Selecting rock by default.");
        player = 1;
     }      
        if (player == 1) System.out.println( "Player throws Rock.");
        else if( player ==  2 ) System.out.println( "Player throws Paper.");
        else System.out.println( "Player throws Scissor.");
       
        //Randomly generate the computer's throw
        int max = 3;
        int min = 1;
        
        int computer = gen.nextInt((max-min) + 1) + min;
       
        //Display the computer's throw
        if (computer == 1) System.out.println( "Computer throws Rock.");
        else if( computer ==  2 ) System.out.println( "Computer throws Paper.");
        else System.out.println( "Computer throws Scissor.");
        
        //Compare the results and declare a winner
        
        if (player == 1 && computer == 3) System.out.println( "You win.");
        else if( player ==  2 && computer == 1) System.out.println( "You win.");
        else if (player == 3 && computer == 2) System.out.println( "You win.");
        else if( player ==  1 && computer == 1) System.out.println( "You tie.");
        else if (player == 2 && computer == 2) System.out.println( "You tie.");
        else if( player ==  3 && computer == 3) System.out.println( "You tie.");
        else System.out.println( "You lose.");
        
    }
}