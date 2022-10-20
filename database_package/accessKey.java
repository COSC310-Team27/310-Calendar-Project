package cosc310project_database;

public class accessKey {
	private final String user, pass, url;
	
	
	accessKey(String user, String pass, String url){
		//DB Details
		this.user = user;
		this.pass = pass;
		this.url = url;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getPass() {
		return pass;
	}
	
	public String getURL() {
		return url;
	}
	
}
