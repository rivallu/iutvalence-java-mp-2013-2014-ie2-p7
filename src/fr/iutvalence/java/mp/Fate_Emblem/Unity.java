package fr.iutvalence.java.mp.Fate_Emblem;

/**
 * We use this class for create, initialize the unities' statistic 
 * @author rivallu
 *
 */
public abstract class Unity
{
    /**
     * We define variables for unities ( atk,def,speed,magic,life)
     */
    private int atk;
    private int def;
    private int speed;
    private int magic;
    private int life;
    
    /**
     * @param atk it's a variable to represent the attack of an unity
     * @param def it's a variable to represent the defense of an unity
     * @param speed it's a variable to represent the movement speed of an unity
     * @param magic it's a variable to represent the magic power of an unity 
     * @param life it's a variable to represent the life of an unity
     */
    public void newunity (int atk,int def,int speed,int magic,int life)
    {
        this.atk=atk;
        this.def=def;
        this.speed=speed;
        this.magic=magic;
        this.life=life;    
    }
    
    
    
    

}
