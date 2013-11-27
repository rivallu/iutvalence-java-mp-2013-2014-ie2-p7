package fr.iutvalence.java.mp.Fate_Emblem;

import fr.iutvalence.java.mp.Fate_Emblem.units.*;


/**
 * this class is the main of the project 
 * @author rivallu
 *
 */
public class Main
{

    // TODO (fixed) write comment
    /**
     * This method will generate 2 player and 2 army.
     * @param args
     */
    public static void main(String[] args)
    {
        Saber hero = new Saber() ;
        Army army1 = new Army(hero);
        Army army2 = null;

        new Game("j1", "j2", army1, army2).play();

    }

    
    
    
}
