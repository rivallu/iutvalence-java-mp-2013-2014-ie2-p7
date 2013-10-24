package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * it's the class of the map composed by
 * 
 * @author rivallu
 * 
 */
// TODO (fixed) comply with naming conventions
public class Map
{

    /**
     * it's a double dim board for generate a map.
     */
    private int[][] map;

    public static final int MAP_MAX_SIZE = 80;
    
    public static final int WATER = 0;
    public static final int WOOD = 1;
    public static final int TOWER = 2;
    public static final int WALL = 3;

    /**
     * this constructor creates a new map with 80 case*80case
     */
    public Map()
    {
        this.map = new int[MAP_MAX_SIZE][MAP_MAX_SIZE];
    }

    /**
     * print the map 
     */
    public void affiche ()
    {
        for (int i=0;i<=MAP_MAX_SIZE;i++)
        {
            for (int j=0; j<=MAP_MAX_SIZE;j++)
            {
                System.out.print(this.map[i][j]);
            }
            System.out.println("");  
        }
    }
    public void add_decor()
    {
        
    }


}
