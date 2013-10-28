package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * the player class composed by name of the player and his army
 * 
 * @author rivallu
 * 
 */
public class Player
{
    // TODO (fix) write javadoc comment
    // name will be save the name of a player
    private String name;

    // TODO (fix) write javadoc comment
    // this variable will save the army of the player
    private Army army;

    // TODO (fix) write comment
    public Player(String name, Army army)
    {
        this.name = name;
        this.army = army;
    }

}
