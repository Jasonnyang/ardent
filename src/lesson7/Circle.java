package lesson7;

public class Circle
{
    // VARIABLE DECLARATIONS
    // class variable (static) that is a constant
    // class variable are not copied into every object--referenced directly from the lass
    public static final double PI = 3.14159;
    
    //instance variable
    private double radius;
    
    // CONSTRUCTOR
    
    //standard contructor without any variables - create a unit circle
    public Circle() 
    {
        radius = 1.0; 
    }
    
    //overloaded contructor that accepts a radius
    public Circle( double newRadius ) {
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
        double circleArea = PI * radius * radius;
        return circleArea;
    }
}
