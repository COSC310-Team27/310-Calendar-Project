package scheduler;

public class testMain {

	public static void main(String[] args) {
		RankingModel rm = new RankingModel(16,10,10,48);//double sleepTime, double fixedTime, double eventTime, double timeAvailable

		System.out.println("The Ranking Variable is :" + rm.getRankingVaraible());
	}

}
