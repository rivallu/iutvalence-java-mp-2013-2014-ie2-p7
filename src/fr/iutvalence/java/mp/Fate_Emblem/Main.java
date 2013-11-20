package fr.iutvalence.java.mp.Fate_Emblem;

// TODO (fixed) rewrite comment
/**
 *this class is the main of the porject 
 * @author rivallu
 *
 */
public class Main
{

    // TODO (fix) write comment
    /**
     * This method will generate 2 player and 2 army 
     * @param args
     */
    public static void main(String[] args)
    {
        Army army1 = null;

        Army army2 = null;

        new Game("j1", "j2", army1, army2).play();

    }

    
    
    
}
