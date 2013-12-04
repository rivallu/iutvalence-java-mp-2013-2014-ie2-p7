package fr.iutvalence.java.mp.Fate_Emblem;

public class Position
{
    private int X;
    private int Y;
    private int OLDX;
    private int OLDY;
    
    public Position ()
    {
        this.X=60;
        this.Y=5;
        this.OLDX=60;
        this.OLDY=5;
        
    }
    public Position(int X, int Y)
    {
        this.X=X;
        this.Y=Y;
        this.OLDX=X;
        this.OLDY=Y;
    }
    
    public int getX()
    {
        return this.X;
    }
    public int getY()
    {
        return this.Y;
    }
    public int getOLDX()
    {
        return this.OLDX;
    }
    public int getOLDY()
    {
        return this.OLDY;
    }
    
    public void movepos (int speed)
    {
        this.OLDX=this.X;
        this.X=this.X+speed;
        this.OLDY=this.Y;
        this.Y=this.Y+speed;
        
    }
    

}
