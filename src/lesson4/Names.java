package lesson4;

public class Names {
    public static void main( String[] args){
        //this is a string with the name Bob
        String name = "bob";
        
        //make a new array of type char with the letters from the String name
        char[] letters = name.toCharArray();
        
        //make a new array that is two elements larger
        char[] newName = new char[5];
        
        //copy the three letters from letters into newName
        for (int i = 0; i < letters.length; i++) {
            newName [ i ] = letters[ i ];
        }    
        
        // set the two remaining index positions with new chars
        newName [ 3 ] = 'b';
        newName [ 4 ] = 'y';
        
        //convert the character array newName into a string sNewName
        String sNewName = String.valueOf ( newName );
        
        //print out the new modified name
        System.out.println( sNewName );
        
        //Short Way
        String name2 = "Jen";
        String extension = "ifer";
        
        //name 3 is a concatenation of these two above String variables
        String name3 = name2 + extension;
        System.out.println ( name3 );
        
        // using substring
        String sentence = "I love dogs.";
        
        //the first number is the index of the first character (inclusive)
        //the second number is the index of the ending index (exclusive)
        String obj = sentence.substring(7,11);
        System.out.println( obj );
    }    
}