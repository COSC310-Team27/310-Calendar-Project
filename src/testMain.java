import java.sql.Date;
import java.util.ArrayList;
import java.util.Timer;

import cosc310project_communication.mailKey;
import cosc310project_communication.notifyUser;
import cosc310project_databaseAndLogin.userKey;
import cosc310project_scheduling.*;

public class testMain {

	public static void main(String[] args) throws Exception {
//		ArrayList<event> a = new ArrayList<event>();
//		a.add(new event("091929930", "Lunch At John's","Lunch At John's Place",Date.valueOf("2022-12-02"),"U5","000",true));
//		a.add(new event("091922222", "Meet Yatharth","Meeting with Yatharth About Computer Science",Date.valueOf("2022-12-03"),"Kalamalka","000",true));
//		a.add(new event("091929333", "COSC 310 Assignment","Finish COSC 310",Date.valueOf("2022-12-02"),"UBC","000",false));
//		a.add(new event("091953343", "Take Out The Trash","take out the trash bro its been days",Date.valueOf("2022-12-04"),"U8","000",false));
//		a.add(new event("091944533", "Going Out To Downtown","Downtown",Date.valueOf("2022-12-02"),"Downtown, Kelowna","000",true));
//		mailKey mk = new mailKey("userNotify310@gmail.com","icvointohnywrnwn");
//		userKey uk = new userKey("chrisgrace281@gmail.com","Chris281");
//		uk.setEventsNoDB(a);
//		//new notifyUser(uk,mk).run();
//		
//		Timer timer = new Timer();
//	    
//		timer.schedule(new notifyUser(uk,mk), 100);
		
		scheduleSports ss = new scheduleSports(league.NFL);
		
		
		
		
		
	}

}

//CFL link = "http://api.cfl.ca/v1/games/2015?key=HyP9UlqyhBHDTbKn2Kzdddk6KlyjzBJ2"
