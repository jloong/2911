package tennis_two;

public class SinglesGame extends SerialContest implements Game {

	public SinglesGame(Player firstServer, int targetScore, int advantage) {
		super(firstServer, targetScore, advantage);
	}
	
	@Override
	public String getContestName() {
		return "SinglesGame";
	}

	@Override
	protected Contest makeSubContest() {
		return TennisFactory.instance().makePoint(firstServer);
	}
	
	@Override
    public String scoreAsString (Player player)
    {
		assert score(player) >= 0 && score(players().other(player)) >= 0;
        switch (score(player)) {
            case 0:
                return "00";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                if (score(player) <= score(players().other(player)))
                    return "40";
                if (score(player) == score(players().other(player)) + 1)
                    return "Advantage";
                return "Game";
        }
    }

}
