package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * the army class composed by some units and one hero
 * 
 * @author rivallu
 * 
 */

public class Army
{
    // it's the board for the army
    // TODO (fix) this field should be declared as private
    // TODO (fix) write comment
    public Unit[] army;
    
    // TODO (fix) this field should be declared as private
    // TODO (fix) write comment
    // it's the variable for the hero
    public Unit hero;

    // TODO (fix) write comment
    public Army(Unit hero)
    {
        Army army[] = new Army[19];
        this.hero = hero;
        for (int i = 0; i < 20; i++)
        {
            army[i] = Villager();
        }
    }

}
