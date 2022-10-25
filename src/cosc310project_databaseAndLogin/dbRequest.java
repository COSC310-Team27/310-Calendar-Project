package cosc310project_databaseAndLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dbRequest {
	
	private final dbKey DBkey;	//dbKey to interact with DB
	
	//DB variables
	private Statement stmt;		
	private Connection conn;
	static boolean prevDbTest;
	
	
	public dbRequest(dbKey key) throws SQLException{	//Sets dbKey to DBKey Variable
		this.DBkey = key;	
		if (testDB() == false) {
			throw new SQLException("Unsuccessful Connection!");
		}
		System.out.println("DB Object testing Sucessful!");
	}
	
	private void connect() {	//Verify if there is an existing connection and if not connect
		try {
			if(conn == null || conn.isClosed()) connectToDatabase(DBkey);
			else System.err.println("WARNING: Database is already connected!");
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-c): "+e);
		}
	}
	
	private void connectToDatabase(dbKey key) {	//Establish connection with database
		try{
			conn = DriverManager.getConnection(key.getURL(), key.getUser(), key.getPass());
			stmt = conn.createStatement();
			System.out.println("Database Connection Established!");
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-ctb): "+e);
		}
	}
	
	public void close() {	//Close DB connection
		try {
			if(!conn.isClosed()) {
				conn.close();
				stmt = null;
				System.out.println("Database Closed!");
			}
			else System.err.println("WARNING: Database is already closed!");
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-c2): "+e);
		}
	}
	
	public boolean isOpen() {	//Check if DB is open
		try{
			return !conn.isClosed();
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-io): "+e);
		}
		return false;
	}
	
	public ResultSet query(String sql) { //All SELECT Operations
		connect();
		try {
			return stmt.executeQuery(sql);	
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-q): "+e);
		}finally{
			//close();
		}
		return null;
	}
	
	public void update(String sql) {		//UPDATE, INSERT, DELETE
		connect();
		try {
			 stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-u): "+e);
		}finally{
			//close();
		}
	}
	
	public void execute(String sql) {		//Any SQL Code
		connect();
		try {
			 stmt.execute(sql);
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-e): "+e);
		}finally{
			//close();
		}
	}
	
	private boolean testDB() {		//Test DB
		if (prevDbTest==true) return true;
		try {
			connect();
			close();
			prevDbTest = true;
			return true;
		}catch(Exception e) {
			System.err.println("FATAL ERROR(dr-t): "+e);
		}
		return false;
	}
	
}
