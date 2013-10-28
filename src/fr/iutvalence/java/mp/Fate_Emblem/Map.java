package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * it's the class of the map composed by
 * 
 * @author rivallu
 * 
 */
public class Map
{
    // TODO (fix) write comment
    public static final int MAP_MAX_SIZE = 80;

    // TODO (fix) write comment
    public static final int WATER = 0;
    
    // TODO (fix) write comment
    public static final int WOOD = 1;
    
    // TODO (fix) write comment
    public static final int TOWER = 2;
    
    // TODO (fix) write comment
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
    public void display()
    {
        for (int i = 0; i <= MAP_MAX_SIZE; i++)
        {
            for (int j = 0; j <= MAP_MAX_SIZE; j++)
            {
                System.out.print(this.map[i][j]);
            }
            System.out.println("");
        }
    }

    // TODO (fix) write comment
    public void add_decor()
    {

    }

}
