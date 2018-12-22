import java.util.Random;
public class World
{
    //variables
    private Cell[][] world;
    private int worldSize;
    private Random gen;
    
    //constructor
    public World( int size )
    {
        worldSize = size;
        gen = new Random();
        //instantiate the new world at the given size
        world = new Cell[size][size];
        
        //prepopulate the world randomly
        for( int row = 0; row < world.length; row++) 
        {
            for( int col = 0; col < world[0].length; col++ )
            {
                //determine if the new cell will be alive or dead
                int number = gen.nextInt( 2 );
                //create the new cell
                if( number == 0 ) {
                    world[ row ][ col ] = new Cell( false );
                }  
                else 
                {
                    world[ row ][ col ] = new Cell( true );
                }
            }
        }
        
    }
    //display world
    public void displayWorld()
    {
        System.out.println( "Current world state:" );
        for( int row = 0; row < world.length; row++) 
        {
            for( int col = 0; col < world[0].length; col++ )
            {
                if( world[ row ][ col ].alive() )
                {
                    System.out.print( "0" );
                }
                else
                {
                    System.out.print( "." );
                }
            }
            System.out.println();
        }
    }
    
    //generation function - one iteration
    public void generation(int row, int col)
    {
        //this is the temporary world that will hold the newly generated state
        Cell[][] tempWorld = new Cell[ worldSize ][ worldSize ];
        
        //your work
        for (int row = 0; row < 20; row++)
        {
            int neighbors = 0;
        if (row = 0 && col = 0) 
        {
            if (world[row] = 1 && world[col] = 0) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 1 && world[col] = 1) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 0 && world[col] = 1) neighbors ++;
            else neighbors = neighbors;
        {
        else if (row = 20 && col = 0) 
        {
        	if (world[row] = 19 && world[col] = 0) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 19 && world[col] = 1) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 20 && world[col] = 1) neighbors ++;
            else neighbors = neighbors;
        }
        else if (row = 0 && col = 20) 
        {
        	if (world[row] = 0 && world[col] = 19) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 1 && world[col] = 19) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 0 && world[col] = 20) neighbors ++;
            else neighbors = neighbors;
        }
        else if (row = 20 && col = 20) 
        {
        	if (world[row] = 19 && world[col] = 20) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 19 && world[col] = 19) neighbors ++;
            else neighbors = neighbors;
            if (world[row] = 20 && world[col] = 19) neighbors ++;
            else neighbors = neighbors;
        }
        else if (row = 0 && col != 0 && col != 20) 
        {
        	if (world[row] = 1 && world[col] = 0) neighbors ++;
            else neighbors = neighbors;
        	if (world[row] = 1 && world[col] = 1) neighbors ++;
            else neighbors = neighbors;
        if (world[row] = 0 && world[col] = 1) neighbors ++;
            else neighbors = neighbors;
        }
        else if (row = 20 && col != 0 && col != 20) 
        {
            
        }
        else if (row != 0 && row != 20 && col = 0) 
        {
            
        }
        else if (row != 0 && row != 20 && col = 20) 
        {
            
        }
        else
        {
            
        }
        //when all is said and done, copy tempWorld
        world = tempWorld;
    }
}
}
