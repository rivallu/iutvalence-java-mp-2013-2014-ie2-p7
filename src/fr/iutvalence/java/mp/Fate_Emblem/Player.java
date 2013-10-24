package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * the player class composed by name of the player and his army
 * 
 * @author rivallu
 * 
 */
public class Player
{
    // TODO (fixed) this field should be declared as private
    // TODO (fixed) write comment
    // name will be save the name of a player 
    private String name;
    
    // TODO (fixed) this field should be declared as private
    // TODO (fixed) write comment
    // this variable will save the army of the player
    private Army army;
    
    public Player (String name, Army army)
    {
        this.name= name;
        this.army=army;
    }

}
