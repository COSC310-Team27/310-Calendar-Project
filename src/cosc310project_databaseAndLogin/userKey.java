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
		try {
			ResultSet rs = new dbRequest(k) // Creating new dbRequest to fetch Unique User ID
					.query("SELECT uuid FROM userCred WHERE username = \""+user+"\" AND password = \""+pass+"\";");			// Querying using user name and password
			rs.next();
			this.uuid = rs.getString("uuid");
			
			return true;
		}catch(Exception e) {
			System.err.println("FATAL ERROR(uk-gu):"+e);
		}
		return false;
	}
	

	private ArrayList<event> fillEvents(dbKey k) { //Get and Fill Events
		ArrayList<event> temp = new ArrayList<event>();
		try {
			 ResultSet rs = new dbRequest(k)	// Creating ResultSet object to store query result 
					 .query("INSERT SQL CODE HERE");						//Creating new dbRequest to fetch Unique User ID
			 while(rs.next()) {
				 temp.add(						//Adding to temp ArrayList a new object of type events until ResultSet is empty
						 new event(rs.getString("eventName"), rs.getString("desc"), 
								 rs.getString("loc"), rs.getBoolean("isFixed"),
								 rs.getBoolean("isRepeated"), rs.getInt("priority"),
								 rs.getInt("timeTaken"), rs.getDate("dueDate")));
			 }
			 return temp;	  
		}catch(Exception e) {
			System.err.println("FATAL ERROR(uk-fe):"+e);
		}
		return null;
	}
}
