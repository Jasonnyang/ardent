package lesson9;

public class Disk {
public static final double PI = 3.14159;
    
    //instance variable
    private double radius;
    
    // CONSTRUCTOR
    
    //standard contructor without any variables - create a unit circle
    public Disk() 
    {
        radius = 1.0; 
    }
    
    //overloaded contructor that accepts a radius
    public Disk( double newRadius ) {
        radius = newRadius;
    }
    
    //Methods - Behavior
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius ( double newRadius ) 
    {
        radius = newRadius;
    }
    
    public double area()
    {
        double diskArea = PI * radius * radius;
        return diskArea;
    }
}
