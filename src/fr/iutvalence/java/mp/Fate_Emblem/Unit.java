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
    
    private Position position;

    
    // TODO (fix) consider gathering the two coordinates in a single object called Position
    // TODO (fix) write comment
    // TODO (fix) comply with naming conventions
    // A metre dans une classe quand on arrivera à déplacer une unité
   //public int X =60;

    // TODO (fix) write comment
    // TODO (fix) comply with naming conventions
  //  public int Y=5;
    
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
        int X = (int) (Math.random() * 10);
        int Y = (int) (Math.random() * 10);
        this.position= new Position(X,Y); 
    }
    /**
     * return the 
     * @return
     */
    public int getPosX()
    {
        return this.position.getX();
    }
    public int getPosY()
    {
        return this.position.getY();
    }

    public int getOLDX()
    {
        return this.position.getOLDX();
    }
    
    public int getOLDY()
    {
        return this.position.getOLDY();
    }
    
    /**
     * it's the method for move a unit
     * @param unit
     */
    public void deplacement(Map map)
    {
        if ((this.position.getX()+this.speed!= Map.MAP_MAX_SIZE))
        {
            if (this.position.getY()+this.speed!= Map.MAP_MAX_SIZE)
            {
                if (map.whoIsHere(this.position.getX()+this.speed,this.position.getY()+this.speed)==Map.EARTH)
                {
                    this.position.movepos(this.speed); 
                }
                else
                {
                    this.position.movepos(this.speed-1);
                }
                
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
