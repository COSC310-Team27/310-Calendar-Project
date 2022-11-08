package cosc310project_databaseAndLogin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cosc310project_scheduling.event;

public class userKey extends key{
	private String uuid; //DB identifier - uuid(Unique User ID)
	private ArrayList<event> events;
	private dbKey dbKey;
	
	public userKey(String user, String pw, dbKey dbKey){
		super(user,pw); //INIT super constructor
		//this.user = hash(user); pass = hash(pass);  //Hashing User name and password
		this.dbKey = dbKey;
		if (getUUID(dbKey)) {
			System.out.println("User Cred Validated!");
		}else System.out.println("User Cred Incorrect!");
		//events = fillEvents(dbKey);	//Fill Events
	}
	
	public String getUUID() {	//Return user's UUID
		return uuid;
	}
	
	public ArrayList<event> getEvents(){
		return events;
	}
	
	public dbKey getDBkey() {
		return dbKey;
	}
	
	private boolean getUUID(dbKey k) { //Get UUID from DB
		//GET UUID
	}
	
	//REDO
	private ArrayList<event> fillEvents(dbKey k) { //Get and Fill Events
		//GET EVENTS
	}
}
