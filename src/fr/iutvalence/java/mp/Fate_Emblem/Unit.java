package fr.iutvalence.java.mp.Fate_Emblem;

// TODO (fix) rewrite comment
/**
 * We use this class for create, initialize the unities' statistic
 * 
 * @author rivallu
 * 
 */
public abstract class Unit
{

    /**
     *  ithe attack of an unity
     */
    private int atk;

    /**
     *  the defense of an unity
     */
    private int def;

    /**
     * the movement speed of an unity
     */
    private int speed;

    /**
     * the magic power of an unity
     */
    private int magic;

    /**
     *  the life of an unity
     */
    private int life;

    
    // TODO (fix) consider gathering the two coordinates in a single object called Position
    // TODO (fix) write comment
    // TODO (fix) comply with naming conventions
    // A metre dans une classe quand on arrivera à déplacer une unité
   public int X =50;

    // TODO (fix) write comment
    // TODO (fix) comply with naming conventions
    public int Y=50;

    // TODO (fixed) finish writing comment

    
    /**
     * it's the constructor for generate all unities
     * 
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
    public Unit(int atk, int def, int speed, int magic, int life)
    {
        this.atk = atk;
        this.def = def;
        this.speed = speed;
        this.magic = magic;
        this.life = life;
    }

    /**
     * it's the method for move a unit
     * @param unit
     */
    public void deplacement(Unit unit)
    {
        int OLDX=this.X;
        int OLDY=this.Y;
        
        if (Map.EARTH==this.X+this.speed || Map.TOWER==this.X+this.speed && this.X+this.speed!= Map.MAP_MAX_SIZE)
        {
            if (Map.EARTH==this.Y+this.speed || Map.TOWER==this.Y+this.speed && this.Y+this.speed!= Map.MAP_MAX_SIZE)
            {
                this.X=this.X+this.speed;
                this.Y= this.Y+this.speed;
               
            }
            else 
            {
              //retourner erreur de déplacement
            }
        }
        else
        {
          //retourner erreur de déplacement
        }
    }

}
