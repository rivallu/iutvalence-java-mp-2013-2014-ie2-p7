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
    

    // TODO (fixed) rewrite comment (do not say what it is but what it is used
    // for)
    /** 
     *it's for save the hero and add it in the hashtable
     */
    private Unit hero;

    // TODO (fixed) finish writing comment
    /**
     * it's generate an army with one hero and 19 standard units
     * @param hero
     */
    public Army(Unit hero)
    {        
        Hashtable <Integer, Unit> arm = new Hashtable();
        this.army = arm;
        this.army.put(1, hero);
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
    
    /**
     * fait le déplacement de toute l'armée
     */
    public void deplaArmy( )
    {
        for (int i=1; i<20; i++)
        {
            Unit test = (Unit) this.army.get(i);
            test.deplacement(test);   
        }
               
        
    }
}

