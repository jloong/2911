package tennis_two;

public class TieBreakGame extends SerialContest implements Game {

	public TieBreakGame(Player firstServer, int targetScore, int advantage) {
		super(firstServer, targetScore, advantage);
	}

	@Override
	public String getContestName() {
		return "TieBreakGame";
	}

	@Override
	protected Contest makeSubContest() {
		return TennisFactory.instance().makePoint(firstServer);
	}

}
