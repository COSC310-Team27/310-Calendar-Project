/*
 sleepTime : Sleep hours in the availaible time
 fixedTime : Fixed time for events which are defined as fixed(personal)
 timeAvailable: Hours availaible from endDate
 totalFixed: sleepTime + fixedTime
 eventTime: the time taken for the event 
 rankingVariable: a variable used to rank the events based on the model
  */
package scheduler;

public class RankingModel {
	public double sleepTime, fixedTime, timeAvailable, totalFixed, eventTime, rankingVaraible;
	
	RankingModel(){
		this.sleepTime =8;
		this.fixedTime =0;
		this.rankingVaraible =0;
		this.totalFixed = 8;
		this.eventTime = 0;
		this.timeAvailable =0;
	}
	RankingModel(double sleepTime, double fixedTime, double eventTime, double timeAvailable){
		this.sleepTime = sleepTime;
		this.fixedTime = fixedTime;
		this.eventTime = eventTime;
		this.timeAvailable = timeAvailable;
		
		
	}
	 double getSleepTime() { return sleepTime;}
	 double getFixedTime() { return fixedTime;}
	 double getEventTime() { return eventTime;}
	 double gettimeAvailable() {return timeAvailable;}
	 double getTotalFixedTime() { return sleepTime + fixedTime;}	 
	 double getRankingVaraible() { 
		 rankingVaraible  = (timeAvailable - getTotalFixedTime()) / eventTime ;
		 if( rankingVaraible < 0 || getFixedTime() <  0) {
			 return this.rankingVaraible = 0 ;
		 }else
			 return rankingVaraible;
		 
	 }
	
	
}
