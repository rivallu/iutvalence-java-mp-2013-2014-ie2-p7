package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * it's the class of the map composed by
 * 
 * @author rivallu
 * 
 */
public class Map
{
    // TODO (fixed) write comment
    /**
     * it's the max size of the Map
     */
    public static final int MAP_MAX_SIZE = 80;

    // TODO (fixed) write comment
    /**
     * it's a static variable for represent a decor
     */
    public static final int WATER = 0;
    
    // TODO (fixed) write comment
    /**
     * it's a static variable for represent a decor
     */
    public static final int WOOD = 1;
    
    // TODO (fixed) write comment 
    /**
    * it's a static variable for represent a decor
    */
    public static final int TOWER = 2;
    
    // TODO (fixed) write comment 
    /**
    * it's a static variable for represent a decor
    */
    public static final int WALL = 3;

    /**
     * it's a double dim board for generate a map.
     */
    private int[][] map;


    /**
     * this constructor creates a new map with default size
     */
    public Map()
    {
        this.map = new int[MAP_MAX_SIZE][MAP_MAX_SIZE];
    }

    // TODO (fix) replace this by an overriding of Object#toString
    /**
     * display the map
     */
    
    public String toString()
    {
        String result="";
        for (int i = 0; i <= MAP_MAX_SIZE; i++)
        {
            for (int j = 0; j <= MAP_MAX_SIZE; j++)
            {
               result = result + this.map[i][j];
            }
            result = result +"\n";
        }
        System.out.println(result);
        return result;
    }

    // TODO (fixed) write comment
    /**
     * This method will generate a decor for the map 
     */
    public void add_decor()
    {
        for (int i=0; i<=10; i++)
        {
            int j = (int) (Math.random() * 40 );
            int nb = (int) (Math.random() * 5 );
            this.map[i][j]= nb ;
        }
        for (int i=60; i<=80; i++)
        {
            int j = (int) (Math.random() * 40 );
            int nb = (int) (Math.random() * 5 );
            this.map[i][j]= nb ;
        }

    }

}
