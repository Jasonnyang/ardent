package lesson9;

public class Human {
	 	private String Name;
	    private Double Height;
	    private Double Weight;
	    
	    public Human() 
	    {
	        Name = "Bob"; 
	        Height = 62.0;
	        Weight = 150.0;
	    }
	    
	    public Human( String n, Double h, Double w ) {
	        Name = n;
	        Height = h;
	        Weight = w;
	    }
	    
	    //Methods - Behavior
	    
	    public String getName()
	    {
	        return Name;
	    }
	    
	    public void setName ( String newName ) 
	    {
	        Name = newName;
	    }
	    
	    public Double getHeight()
	    {
	        return Height;
	    }
	    
	    public void setHeight ( Double newHeight ) 
	    {
	        Height = newHeight;
	    }
	    
	    public Double getWeight()
	    {
	        return Weight;
	    }
	    
	    public void setWeight ( Double newWeight ) 
	    {
	        Weight = newWeight;
	    }
	    
	    public String toString()
	    {
	        String HumanString = Name + ", " + Height + ", " + Weight + ".";
	        return HumanString;
	    }

}
