package lesson3;


import java.util.Random;
import java.util.Scanner;

public class rps2 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Random gen = new Random();
        
        //Count the number of wins
        int user = 0;
        int comp = 0;
        int tie = 0;
        
        //Ask the player for the amount of games to play
        System.out.print("How many games would you like to play?");
        int games = input.nextInt();
        for( int i = 0; i < games; i++ ) {

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
        else if( player == computer ) System.out.println( "You tie.");
        else System.out.println( "You lose.");
       
        //Grand total
        if (player == 1 && computer == 3){
            user++;
        }
        else if( player ==  2 && computer == 1) {
            user++;
        }
        else if (player == 3 && computer == 2) {
            user++;
        }
        else if (player == computer) {
            tie++;
        }
        else 
            comp++;
        }
        System.out.println("You won " + user + " times");
        System.out.println("You lost " + comp + " times");
        System.out.println("You tied " + tie + " times");
        
        //Grand winner
        if (user > comp) {
            System.out.println("You won the game");
        }
        else if (user > comp) {
            System.out.println("You lost the game");
        }
        else {
            System.out.println("You tied the game");
        }
        }
    }