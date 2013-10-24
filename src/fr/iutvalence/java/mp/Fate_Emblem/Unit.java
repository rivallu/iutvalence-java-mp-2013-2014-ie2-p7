package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * We use this class for create, initialize the unities' statistic
 * 
 * @author rivallu
 * 
 */
// TODO (fixed) this class should be named Unit
public abstract class Unit
{
    /**
     * We define variables for unities ( atk,def,speed,magic,life)
     */

    // TODO (fixed) write comment
    // it's a variable to represent the attack of an unity
    private int atk;

    // TODO (fixed) write comment
    //it's a variable to represent the defense of an unity
    private int def;

    // TODO (fixed) write comment
    //it's a variable to represent the movement speed of an unity
    private int speed;

    // TODO (fixed) write comment
    //it's a variable to represent the magic power of an unity
    private int magic;

    // TODO (fixed) write comment
    //it's a variable to represent the life of an unity
    private int life;
    
    private int X;
    private int Y;

    // TODO (fixed) finish writing comment
    /**
     * it's the constructor for generate all unities
     * @param atk
     *            it's a variable to represent the attack of an unity
     * @param def
     *            it's a variable to represent the defense of an unity
     * @param speed
     *            it's a variable to represent the movement speed of an unity
     * @param magic
     *            it's a variable to represent the magic power of an unity
     * @param life
     *            it's a variable to represent the life of an unity
     */
    // TODO (fixed) 
    public Unit (int atk, int def, int speed, int magic, int life)
    {
        this.atk = atk;
        this.def = def;
        this.speed = speed;
        this.magic = magic;
        this.life = life;
    }
    
    public void deplacement (Unit unit)
    {
        
    }

}
