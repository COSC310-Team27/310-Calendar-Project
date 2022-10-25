package cosc310project_databaseAndLogin;

public class dbKey extends key{
	private String url;	//URL of the DB to connect
	
	
	public dbKey(String usr, String pw, String url){  //DB Access KEY
		super(usr,pw);
		this.url = url;
	}
	
	public String getURL() {	//Get URL of DB
		return url;
	}
	
}
