package tennis_two;

import java.util.Random;

import util.Two;

public class TennisFactory
{
    protected static TennisFactory theFactory;
    
    public static TennisFactory instance ()
    {
        return theFactory;
    }
    
    public static TennisFactory make (Two <Player> players, long seed)
    {
        theFactory = new TennisFactory (players, seed);
        return theFactory;
    }
    
    public final Two <Player> players;
    private final Random      random;
    private boolean           displayIsEnabled;
    
    protected TennisFactory (Two <Player> players, long seed)
    {
        this.players = players;
        this.random = new Random (seed);
        this.displayIsEnabled = false;
    }
    
    public Two <Player> players ()
    {
        return players;
    }
    
    public Match makeAdvantageMatch (Player firstServer, int maxSetCount)
    {
    	if (maxSetCount == 3) {
    		return new SinglesMatch(firstServer, 2, 1); 
    	}
    	else 
    		return new SinglesMatch(firstServer, 3, 1);    
    }
    
    public Match makeTieBreakMatch (Player firstServer, int maxSetCount)
    {
        // TODO
        return null;
    }
    
    public Set makeAdvantageSet (Player firstServer)
    {
        return new SinglesSet(firstServer, 6, 2);
    }
    
    public Set makeTieBreakSet (Player firstServer)
    {
        // TODO
        return null;
    }
    
    public Game makeSinglesGame (Player server)
    {
        return new SinglesGame (server, 4, 2);
    }
    
    public Game makeTieBreakGame (Player firstServer)
    {
        // TODO
        return null;
    }
    
    public Point makePoint (Player server)
    {
        return new SinglesPoint (server);
    }
    
    public Player nextPointWinner ()
    {
        if (random.nextBoolean ())
            return players._1;
        else
            return players._2;
    }
    
    public boolean displayIsEnabled ()
    {
        return displayIsEnabled;
    }
    
    public void setDisplayOn ()
    {
        displayIsEnabled = true;
    }

    public void setDisplayOff ()
    {
        displayIsEnabled = false;
    }
}
