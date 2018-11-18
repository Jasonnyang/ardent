package lesson9;

public class RightTriangle {
	   
    //instance variable
    private double length;
    private double height;
    
    // CONSTRUCTOR
    
    //standard contructor without any variables - create a unit circle
    public RightTriangle() 
    {
        length = 1.0; 
        height = 4.0;
    }
    
    //overloaded contructor that accepts a radius
    public RightTriangle( double l, double h ) {
        length = l;
        height = h;
    }
    
    //Methods - Behavior
    
    public double getlength()
    {
        return length;
    }
    
    public void setLength ( double newLength ) 
    {
        length = newLength;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight ( double newHeight ) 
    {
        height = newHeight;
    }
    
    public double area()
    {
        return length * height * 0.5;
    }
    
    public double perimeter()
    {
        return 2*(length + height + Math.sqrt(length * length + height * height));
    }
}
