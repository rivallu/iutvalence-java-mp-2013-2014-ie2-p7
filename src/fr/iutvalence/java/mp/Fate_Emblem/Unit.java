package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * We use this class for create, initialize the unities' statistic 
 * @author rivallu
 *
 */
// TODO (fix) this class should be named Unit
public abstract class Unity
{
    /**
     * We define variables for unities ( atk,def,speed,magic,life)
     */
    
    // TODO (fix) write comment
    private int atk;

    // TODO (fix) write comment
    private int def;
    
    // TODO (fix) write comment
    private int speed;
    
    // TODO (fix) write comment
    private int magic;
    
    // TODO (fix) write comment
    private int life;
    
    // TODO (fix) finish writing comment
    /**
     * @param atk it's a variable to represent the attack of an unity
     * @param def it's a variable to represent the defense of an unity
     * @param speed it's a variable to represent the movement speed of an unity
     * @param magic it's a variable to represent the magic power of an unity 
     * @param life it's a variable to represent the life of an unity
     */
    // TODO (fix) if this is a constructor, declare it as a constructor
    public void newunity (int atk,int def,int speed,int magic,int life)
    {
        this.atk=atk;
        this.def=def;
        this.speed=speed;
        this.magic=magic;
        this.life=life;    
    }
    
    
    
    

}
