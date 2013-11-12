package fr.iutvalence.java.mp.Fate_Emblem;
import java.util.Enumeration;
import java.util.Hashtable;

import fr.iutvalence.java.mp.Fate_Emblem.units.Villager;

/**
 * the army class composed by some units and one hero
 * 
 * @author rivallu
 * 
 */

public class Army
{
    // it's collection of unities

    private Hashtable army;
    

    // TODO (fix) write javadoc comment
    // it's the variable for the hero
    private Unit hero;

    // TODO (fix) finish writing comment
    /**
     * it's the constructor for generate an army
     * 
     * @param hero
     */
    public Army(Unit hero)
    {
        Hashtable army = new Hashtable();
        this.hero = hero;
        army.put(1, hero);
        for (int i = 2; i < 20; i++)
        {
            Unit villager= new Villager();
            army.put(i,villager);
        }
       
    }
    

}

