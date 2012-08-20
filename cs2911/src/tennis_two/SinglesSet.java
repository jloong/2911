package tennis_two;

public class SinglesSet extends SerialContest implements Set {

	public SinglesSet(Player firstServer, int targetScore, int advantage) {
		super(firstServer, targetScore, advantage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContestName() {
		return "AdvantageSet";
	}

	@Override
	protected Contest makeSubContest() {
		return TennisFactory.instance().makeSinglesGame(firstServer);
	}

}
