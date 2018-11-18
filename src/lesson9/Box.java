package lesson9;

public class Box {
	 //instance variable
    private double length;
    private double width;
    private double height;
    
    // CONSTRUCTOR
    
    //standard contructor without any variables - create a unit circle
    public Box() 
    {
        length = 1.0; 
        width = 4.0;
        height = 2.0;
    }
    
    //overloaded contructor that accepts a radius
    public Box( double l, double w, double h ) {
        length = l;
        width = w;
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
    
    public double getWidth()
    {
        return width;
    }
    
    public void setWidth ( double newWidth ) 
    {
        width = newWidth;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void setHeight ( double newHeight ) 
    {
        height = newHeight;
    }
    
    public double volume()
    {
        return length * width * height;
    }
    
    public double perimeter()
    {
        return 2*(length + width + height);
    }
}
