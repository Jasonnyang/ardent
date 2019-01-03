package Deck;

public class Card
{
    private String rank;
    private String suit;
    private int value;
    
    public Card( String rank, String suit, int value)
    {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }
    
    public String toString()
    {
        String cardString = rank + " of " + suit + " ( value = " + value + " )";
        return cardString;
    }
}

