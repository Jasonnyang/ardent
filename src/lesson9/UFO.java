package lesson9;
import java.util.ArrayList;

public class UFO {
	
    private String Name;
    private String Captain;
    
    public UFO() 
    {
        Name = "Bob"; 
        Captain = "John";
    }
    
    public UFO( String n, String c ) {
        Name = n;
        Captain = c;
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
    
    public String getCaptain()
    {
        return Captain;
    }
    
    public void setCaptain ( String newCaptain ) 
    {
        Captain = newCaptain;
    }
	
	public static void main( String[] args ) {
	     ArrayList<String> names = new ArrayList <String>();
	     
	     names.add("Bob");
	     names.add("Sally");
	     names.add("Richard");
	     names.add("Mary");
	     names.add("Harry");
	     names.add("Jennifer");
	        
	     names.add(0, "Pikachu");
	     names.add(1, "Charmander");
	     names.add(5, "Squirtle");
	     
	     names.remove (6);
	     names.remove ("Sally");
	     
	     for (String n : names) {
	        System.out.println( n );
	        }
	        
	     System.out.println(names.size());
	    }

	public void addToPod() {
		
	}
}
