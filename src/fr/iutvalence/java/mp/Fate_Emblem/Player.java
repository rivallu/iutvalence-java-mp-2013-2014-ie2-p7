package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * the player class composed by name of the player and his army
 * 
 * @author rivallu
 * 
 */
public class Player
{
    // TODO (fixed) write javadoc comment
    /**
     * name will be save the name of a player
     */
    private String name;

    // TODO (fixed) write javadoc comment
    /**
     *  this variable will save the army of the player
     */
    private Army army;

    /**
     * it's the constructor for generate a new Player
     * @param name it's the name of the player
     * @param army
     */
    public Player(String name, Army army)
    {
        this.name = name;
        this.army = army;
    }

}
