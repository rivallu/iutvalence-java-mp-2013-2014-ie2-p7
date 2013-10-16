package fr.iutvalence.java.mp.Fate_Emblem;

// TODO (fix) rewrite comment
/**
 * It's when the game start
 * @author rivallu
 *
 */
public class Game
{
    // TODO (fixed) write comment
    // it's a board of players
    private Player[] players;

    // TODO (fixed) write comment
    // it's the Map
    private Map map;
    /**
     * this constructor create 2 players and generate the map 
     * @param name1 it's the first player's name
     * @param name2 it's the second player's name
     * @param army1 it's the army of the first player
     * @param army2 it's the army of the second player
     */
    public Game(String name1, String name2, Army army1, Army army2)
    {
        Player players[]= new Player[2];
        players[0]= Player(name1, army1);
        players[1]= Player(name2, army2);
        this.map = Map();
    }
}
