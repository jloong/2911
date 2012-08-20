package tennis_two;

import util.Two;

public interface Contest
{
    Two <Player> players ();
    
    int score (Player player);
    
    String scoreAsString (Player player);
    
    boolean isNew ();
    
    boolean isOver ();
    
    Player winner ();
    
    Player loser ();
    
    Player server ();
    
    Player receiver ();
    
    String getContestName ();

    void display ();
    
    // updates
    void play ();
    
}
