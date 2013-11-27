package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * the player class composed by name of the player and his army
 * 
 * @author rivallu
 * 
 */
public class Player
{
    /**
     * name of a player
     */
    private String name;

    /**
     *  the army of the player
     */
    private Army army;

    // TODO (fixed) finish writing comment
    /**
     * generate a new player with an army and his name
     * @param name it's the name of the player
     * @param army it's his army
     */
    public Player(String name, Army army)
    {
        this.name = name;
        this.army = army;
    }
    
    
    public Army getArmy ()
    {
        return this.army;
    }

}
