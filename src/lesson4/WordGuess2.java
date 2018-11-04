package lesson4;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class WordGuess2
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Random gen = new Random();
        
        System.out.println( "Word Guessing Game!" );
        
        // make a list of secret words
        String[] words = { "pizza", "mississippi", "racecar", "chococate" };
        
        // generate a random index position for the list of secret words
        int min = 0;
        int max = words.length - 1;
        int randomPos = gen.nextInt( (max-min) -1 ) + min;
        
        // get the secret word
        String secretWord = words[ randomPos ];
        
        // set the maximum number of guesses
        int maxGuesses = (int) ( secretWord.length() * 2.5 );
        
        // counter for the number of guesses made by the player
        int numGuesses = 0;
        
        // make a dashed word with the same number of dashes as letters in the secret word
        String dashWord = "";
        for( int i = 0; i < secretWord.length(); i++ )
        {
            dashWord += "-";
        }
        
        // test the words and dashes
        //System.out.println( secretWord );
        //System.out.println( dashWord );
        
        // before I let the user start guessing, convert the Strings into character arrays
        char[] sw = secretWord.toCharArray();
        char[] dw = dashWord.toCharArray();
        
        // loop - infinite until we stop it with break
        while( true )
        {
            // stop the loop if the user runs out of guesses
            if( numGuesses == maxGuesses )
            {
                System.out.println( "Sorry, you're out of guesses! The secret word is: " + secretWord );
                break;
            }
            
            // stop the loop if the user has guessed all the right letters
            if( Arrays.equals( sw, dw ) )
            {
                System.out.println( "You guessed it! The secret word was: " + secretWord );
                break;
            }
            
            // show user the current dashWord
            String currentWord = String.valueOf( dw );
            System.out.println( currentWord );
            
            // show the number of guesses remaining
            System.out.println( "Number of guesses remaining: " + ( maxGuesses - numGuesses ) );
            
            // prompt the user for a letter or the whole word
            System.out.print( "Guess a letter or try and guess the whole word: " );
            String guess = input.next();
            
            // check and see how long the guess is
            if( guess.length() > 1 )
            {
                if( guess.equals( secretWord ) )
                {
                     System.out.println( "You guessed it! The secret word was: " + secretWord );
                     break;
                }
                else
                {
                    System.out.println( "I'm sorry, that was not it. Keep guessing!" );
                }
            }
            else
            {
                // convert the letter into a char
                char cGuess = guess.charAt( 0 );
                
                // loop - compare the cGuess against all the letters in the secret word
                for( int i = 0; i < sw.length; i++ )
                {
                    // if the cGuess matches the current letter, replace the dash with the letter
                    if( cGuess == sw[ i ] )
                    {
                        dw[ i ] = sw[ i ];
                    }
                }
            }
            
            // increment the number of guesses made by the player
            numGuesses++;
        }
    }
}