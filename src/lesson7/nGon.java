package lesson7;

public class nGon
{
//instance variable
    private int N;
    private int Size;
    
    // CONSTRUCTOR
    public nGon( int N, int Size ) {
        N = N;
        Size = Size;
    }
    
    //Methods - Behavior
    
    public int getSize()
    {
        return Size;
    }
    
    public void setSize ( int newSize ) 
    {
        Size = newSize;
    }
    
    public int getN()
    {
        return N;
    }
    
    public void setN ( int newN ) 
    {
        N = newN;
    }
    
    public int Angle()
    {
        return (N-2) * 180;
    }
}
