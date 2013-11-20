package fr.iutvalence.java.mp.Fate_Emblem;
import java.util.*;

import fr.iutvalence.java.mp.Fate_Emblem.units.*;

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
    

    // TODO (fixed) write javadoc comment
    /** 
     * it's the variable for the hero
     */
    private Unit hero;

    // TODO (fix) finish writing comment
    /**
     * it's the constructor for generate an army 
     * @param hero
     */
    public Army(Unit hero)
    {        
        Hashtable <Integer, Unit> army = new Hashtable();
        army.put(1, hero);
        for (int i = 2; i < 20; i++)
        {
            Unit villager= new Villager();
            army.put(i,villager);
        }
        
        
    }
    /**
     * Cette méthode retourne l'unité qui a pour entrée dans la hastable le parametre
     * @param key le numéro de la clé à chercher
     * @return l'unité qui est rataché à la clé donnée en parametre
     */
    public Unit Get(int key)
    {
        return (Unit) this.army.get(key);
    }
}

