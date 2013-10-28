package fr.iutvalence.java.mp.Fate_Emblem;

// TODO (fixed) rewrite comment
/**
 * it's the class for generate the beginning of the game
 * 
 * @author rivallu
 * 
 */
public class Game
{
    /**
     * in millisecond, the time for a player's round
     */
    public static final int TIME = 120000;
    
    // TODO (fix) rewrite comment (do not say it allow to store something, say what is this something)
    /**
     * save the name of players
     */
    private Player[] players;

    // TODO (fix) rewrite comment (do not say it allow to store something, say what is this something)
    /**
     * save the map
     */
    private Map map;
   
    // TODO (fix) looks like a constant, but it is not
    /**
     * variable for know if the game is ending or not
     */
    private int END_GAME = 1;

    /**
     * this constructor create 2 players and generate the map
     * 
     * @param name1
     *            it's the first player's name
     * @param name2
     *            it's the second player's name
     * @param army1
     *            it's the army of the first player
     * @param army2
     *            it's the army of the second player
     */
    public Game(String name1, String name2, Army army1, Army army2)
    {
        Player players[] = new Player[2];
        players[0] = new Player(name1, army1);
        players[1] = new Player(name2, army2);
        this.map = new Map();
    }

    // TODO (fix) write comment
    public void play()
    {
        while (END_GAME != -1)
        {
            this.map.display();
        }

    }
}
