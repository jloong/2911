package tennis_two;

public class SinglesMatch extends SerialContest implements Match {

	public SinglesMatch(Player firstServer, int targetScore, int advantage) {
		super(firstServer, targetScore, advantage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContestName() {
		return "AdvantageMatch";
	}

	@Override
	protected Contest makeSubContest() {
		return TennisFactory.instance().makeAdvantageSet(firstServer);
	}

}
