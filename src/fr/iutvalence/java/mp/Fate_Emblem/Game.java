package fr.iutvalence.java.mp.Fate_Emblem;
import java.util.*;

// TODO (fixed) rewrite comment (wrong description)
/**
 * It's used to create a new game for two players in a defined map
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

    /**
     * the players
     */
    private Player[] players;

    /**
     * the map
     */
    private Map map;


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

    /**
     * calling this method will start the game
     */
    public void play()
    {
        this.map.addDecor();
        System.out.println(this.map);
        AffArmy(this.map, players[0].army);
        System.out.println(this.map);
        
    }

    // TODO (fixed) finish writing comment
    /**
     * return the position of an army in the Map 
     * 
     * @param map the map for display the army 
     * @param army the army that we want to display
     */

    public void AffArmy(Map map, Army army)
    {
        Unit posunit = army.Get(1);
        map.affUnit(posunit.X, posunit.Y);

    }
}
