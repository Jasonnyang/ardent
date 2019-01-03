package Deck;

import java.util.ArrayList;
import java.util.Random;

public class Deck
{
    //Variables
    // Arraylist of cards
    private ArrayList<Card> cards;
    private Random gen;
   
    //Constructor with Parameter (ranks[], suits[], values[])
    //Look through all ranks, suits, and values to create 52 cards
    public Deck (String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < ranks.length; j++)
            {
                Card newCard = new Card( ranks[j], suits[i], values[j]);
                cards.add( newCard );
            }
        }
        
    }
    
    //Methods
    public String toString() 
    {
        String deckString = "";
        for(Card c : cards )
        {
            deckString += c + "\n";
        }
        return deckString;
    }   

    public Card deal()
    {
        if( cards.size() > 0 )
        {
            Card dealtCard = cards.get( cards.size() - 1 );
            cards.remove( cards.size() - 1 );
            return dealtCard;
        }
        else return null;
    }
    
    public void perfectShuffle()
     {
        int mid = cards.size() / 2; 
        Card[] top = new Card[ mid ];
        Card[] bottom = new Card[ mid ];

        for(int i = 0; i < mid; i++)
          {
              top[i] = cards.get( i );
           }
        for(int i = 0; i < 26; i++)
        {
          bottom[i] = cards.get( mid + i );
        }
        ArrayList<Card> newCards = new ArrayList<Card>();
        for( int i = 0; i < mid; i++ )
        {
            newCards.add( top[ i ] );
            newCards.add( bottom[ i ] );
        }
        cards = newCards;
      }
    public void pileShuffle()
    {
        //Generate a random number of iterations from 3-7 and loop through the
        // algorithm that amount of times
        int max = 7;
        int min = 3;
        int RandomIteration = gen.nextInt((max-min) + 1) + min;
        for ( int a = 0; a <= RandomIteration; a++ )
        {
        //Generate a random number from 1-the total number of cards minus 6
        int max2 = cards.size() - 6;
        int min2 = 0;
        int RandomIndex = gen.nextInt((max2-min2) + 1) + min2;
         for (int b = RandomIndex; b <= RandomIndex + 6; b++ ) {
          //Select 6 cards starting from the random number just chosen to move
          // to the bottom of the deck
          //Move b to the back of the deck
          cards.set( cards.size() + 1, cards.get( b ));
          cards.remove (b);
         }

       }
    }
    public void selectionShuffle()
    {
        int min3 = 0;
        int max3 = cards.size() - 1;
        //for each postion in the deck
        for( int i = 0; i < cards.size(); i++ )
        {
          //generate a random position
          int pos = gen.nextInt((max3-min3) + 1) + min3;
          //swap the card at the current position witht the random position
          //get that card from the random position
          Card tempCard = cards.get( pos );
          
          //take the card at i and put it in pos
          cards.set( pos, cards.get( i ) );
          
          //take the tempCard and put it at i
          cards.set( i, tempCard );
          
        }
        
    }
    public void riffleShuffle() 
    {
        //
    }
}


