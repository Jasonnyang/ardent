package lesson7;

public class Rectangle
{
    
    //instance variable
    private double length;
    private double width;
    
    // CONSTRUCTOR
    
    //standard contructor without any variables - create a unit circle
    public Rectangle() 
    {
        length = 1.0; 
        width = 4.0;
    }
    
    //overloaded contructor that accepts a radius
    public Rectangle( double l, double w ) {
        length = l;
        width = w;
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
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth ( double newWidth ) 
    {
        width = newWidth;
    }
    
    public double area()
    {
        return length * width;
    }
    
    public double perimeter()
    {
        return 2*(length + width);
    }
}
