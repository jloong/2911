package tennis_two;

public class TieBreakSet extends SerialContest implements Set {

	boolean tieBreak = false;
	public TieBreakSet(Player firstServer, int targetScore, int advantage) {
		super(firstServer, targetScore, advantage);
		
	}

	@Override
	public String getContestName() {
		return "TieBreakSet";
	}

	@Override
	protected Contest makeSubContest() {
		if (score(firstServer) == 6 && score(players().other(firstServer)) == 6) {
			tieBreak = true;
			return TennisFactory.instance().makeTieBreakGame(firstServer);
		}
		else {
			return TennisFactory.instance().makeSinglesGame(firstServer);
		}
		
	}
	
	@Override
	public boolean isOver ()
    {
		if (tieBreak == false) {
			return Math.max (score_1, score_2) >= targetScore
               && Math.abs (score_1 - score_2) >= targetAdvantage;
		}
		else {
			return Math.max (score_1, score_2) >= 7
		               && Math.abs (score_1 - score_2) >= 1;
		}
    }

}
