package Deck;

public class CardTest
{
   public static void main( String[] args ){
       Card c1 = new Card ( "A" , "Spades", 11 );
       Card c2 = new Card ( "Q" , "Hearts", 10 );
       Card c3 = new Card ( "5" , "Clubs", 5 );
       
       System.out.println (c1);
       System.out.println (c2);
       System.out.println (c3);
    }
}
