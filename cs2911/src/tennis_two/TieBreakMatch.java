package tennis_two;

public class TieBreakMatch extends SerialContest implements Match {

	public TieBreakMatch(Player firstServer, int targetScore, int advantage) {
		super(firstServer, targetScore, advantage);
	}

	@Override
	public String getContestName() {
		return "TieBreakMatch";
	}

	@Override
	protected Contest makeSubContest() {
		return TennisFactory.instance().makeTieBreakSet(firstServer);
	}

}
