package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * this class allows to manage a map
 * 
 * @author rivallu
 * 
 */
public class Map
{
    /**
     * it's the max size of the Map
     */
    public static final int MAP_MAX_SIZE = 80;

    // TODO (fixed) rewrite comment (do not say what it is but what it is used
    // for)
    /**
     * it's a static variable used to represent the earth on the map
     */
    public static final int EARTH = -1;

    // TODO (fixed) rewrite comment (do not say what it is but what it is used
    // for)
    /**
     * it's a static variable used to represent water as obstacle on the map
     */
    public static final int WATER = 0;

    // TODO (fixed) rewrite comment (do not say what it is but what it is used
    // for)
    /**
     * it's a static variable used to represent wood as obstacle in the map
     */
    public static final int WOOD = 1;

    // TODO (fixed) rewrite comment (do not say what it is but what it is used
    // for)
    /**
     * it's a static variable used to represent tower in the map
     */
    public static final int TOWER = 2;

    // TODO (fixed) rewrite comment (do not say what it is but what it is used
    // for)
    /**
     * it's a static variable used to represent wall as obstacle in the map
     */
    public static final int WALL = 3;

    /**
     * internal map elements storage
     */
    private int[][] map;

    /**
     * this constructor creates a new map with default size
     */
    public Map()
    {
        this.map = new int[MAP_MAX_SIZE][MAP_MAX_SIZE];
    }
   
    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        String result = "";
        for (int i = 0; i < MAP_MAX_SIZE; i++)
        {
            for (int j = 0; j < MAP_MAX_SIZE; j++)
            {
                if (this.map[i][j] == EARTH)
                {
                    result = result + " ";
                }
                else
                {
                    result = result + this.map[i][j];
                }
            }
            result = result + "\n";
        }
        return result;
    }

    /**
     * this method create the decor of the map 
     */
    public void addDecor()
    {
        // initialise la map en earth
        for (int i = 0; i < MAP_MAX_SIZE; i++)
        {
            for (int j = 0; j < MAP_MAX_SIZE; j++)
            {
                this.map[i][j] = EARTH;
            }
        }
        // met du décor en random
        for (int i = 0; i <= 10; i++)
        {
            int j = (int) (Math.random() * 40);
            int nb1 = (int) (Math.random() * 5);
            this.map[i][j] = nb1;
        }
        for (int i = 60; i < MAP_MAX_SIZE; i++)
        {
            int j = (int) (Math.random() * 40);
            int nb2 = (int) (Math.random() * 5);
            this.map[i][j] = nb2;
        }

    }

    // TODO (fix) comply with naming conventions  (parameters)
    // TODO (fixed) finish writing comment (parameters)
    /**
     * this method reset an unit's position after his move  
     * 
     * @param X Abscissa of an unit
     * @param Y Ordinate of an unit
     */
    public void resetDecor(int X, int Y)
    {
        this.map[X][Y] = EARTH;
    }
    /**
     * this method display an unit 
     * @param X Abscissa of an unit
     * @param Y Ordinate of an unit
     */
    public void affUnit(int X, int Y)
    {
        this.map[X][Y]=-2;
    }

}
