package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * it's the class of the map composed by
 * 
 * @author rivallu
 * 
 */
// TODO (fix) comply with naming conventions
public class Map
{
    // TODO (fix) rewrite comment
    /**
     * it's a representation of a map in a board in 2 dimensions.
     */
    // TODO (fix) this field should be declared as private
    int[][] map;
    // some decor of the map

    // TODO (fix) declare constants as constants
    static int water = 0;
    static int wood = 1;
    static int tower = 2;
    static int wall = 3;

    /**
     * this constructor creates a new map with 80 case*80case
     */
    public Map()
    {
        // TODO (fix) declare hard-coded values as constants
        int map[][] = new int[80][80];
    }

}
