package fr.iutvalence.java.mp.Fate_Emblem;
/**
 * manage the position of unit with 4 values, the abscissa and the ordinate and the last abscissa and last ordinate
 * @author rivallu
 *
 */
public class Position
{
    /**
     * Abscissa of an unit
     */
    private int X;
    /**
     * Ordinate of an unit
     */
    private int Y;
    /**
     * The last Abscissa of an unit 
     */
    private int OLDX;
    /**
     * the last Ordinate of an unit
     */
    private int OLDY;
    
    /**
     * 
     */
    public Position ()
    {
        this.X=60;
        this.Y=5;
        this.OLDX=60;
        this.OLDY=5;
        
    }
    /**
     * initialize the position with parameters
     * @param X
     * @param Y
     */
    public Position(int X, int Y)
    {
        this.X=X;
        this.Y=Y;
        this.OLDX=X;
        this.OLDY=Y;
    }
    /**
     * return Abscissa of an unit
     * @return
     */
    public int getX()
    {
        return this.X;
    }
    /**
     * return Ordinate of an unit
     * @return
     */
    public int getY()
    {
        return this.Y;
    }
    /**
     * return the last Abscissa of an unit
     * @return
     */
    public int getOLDX()
    {
        return this.OLDX;
    }
    /**
     * return the last Ordinate of an unit
     * @return
     */
    public int getOLDY()
    {
        return this.OLDY;
    }
    
    /**
     * Move an unit according to the unit's speed
     * @param speed
     */
    public void movepos (int speed)
    {
        this.OLDX=this.X;
        this.X=this.X+speed;
        this.OLDY=this.Y;
        this.Y=this.Y+speed;
        
    }
    

}
