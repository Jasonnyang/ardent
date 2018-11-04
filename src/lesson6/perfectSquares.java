package lesson6;

public class perfectSquares
{
    public static boolean isSquare (int num ) {
        double root = Math.sqrt(num); 
        int truncRoot = (int) root;
        int square = truncRoot * truncRoot;
        
        if ( square == num ) {
            return true;
        }
        else return false;
        
    }
    public static void main ( String[] args ){
        int[] nums = {4, 5, 8, 9, 14, 16, 25 };
        int psCount = 0;
        
        for ( int i = 0; i < nums.length; i++ ){
            if (isSquare( nums [ i ] ) ) {
                psCount++;
            }
        }
        
        int mid = (int) nums.length / 2;
        if (psCount > mid ) System.out.println( "Yes" );
        else System.out.println ( "No" );
    }
}
