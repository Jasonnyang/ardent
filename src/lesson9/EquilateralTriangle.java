package lesson9;

public class EquilateralTriangle {
	   
    //instance variable
    private double side;
    
    // CONSTRUCTOR
    
    //standard contructor without any variables - create a unit circle
    public EquilateralTriangle() 
    {
        side = 1.0; 
    }
    
    //overloaded contructor that accepts a radius
    public EquilateralTriangle( double s ) {
        side = s;
    }
    
    //Methods - Behavior
    
    public double getSide()
    {
        return side;
    }
    
    public void setSide ( double newSide ) 
    {
        side = newSide;
    }
    
    public double area()
    {
        return Math.sqrt(3)/4 * side * side;
    }
    
    public double perimeter()
    {
        return 3*(side);
    }
}
