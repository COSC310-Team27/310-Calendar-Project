package cosc310project_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class database {
	
	private final accessKey key;
	private Statement stmt;
	private Connection conn;
	
	
	database(accessKey key){
		this.key = key;
	}
	
	public void connect() {
		try {
			if(conn.isClosed()) connectToDatabase(key);
			else System.err.println("WARNING: Database is already connected!");
		}catch(Exception e) {
			System.err.println("FATAL ERROR: "+e);
		}
	}
	
	private void connectToDatabase(accessKey key) {
		try{
			conn = DriverManager.getConnection(key.getURL(), key.getUser(), key.getPass());
			stmt = conn.createStatement();
		}catch(Exception e) {
			System.err.println("FATAL ERROR: "+e);
		}
	}
	
	public void close() {
		try {
			if(!conn.isClosed()) {
				conn.close();
				stmt = null;
			}
			else System.err.println("WARNING: Database is already closed!");
		}catch(Exception e) {
			System.err.println("FATAL ERROR: "+e);
		}
	}
	
	public boolean isOpen() {
		try{
			return !conn.isClosed();
		}catch(Exception e) {
			System.err.println("FATAL ERROR: "+e);
		}
		return false;
	}
	
	public ResultSet query(String sql) { //All SELECT Operations
		connect();
		try {
			return stmt.executeQuery(sql);	
		}catch(Exception e) {
			System.err.println("FATAL ERROR: "+e);
		}finally{
			close();
		}
		return null;
	}
	
	public void update(String sql) {		//UPDATE, INSERT, DELETE
		connect();
		try {
			 stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.err.println("FATAL ERROR: "+e);
		}finally{
			close();
		}
	}
	
	public void execute(String sql) {		//Any SQL Code
		connect();
		try {
			 stmt.execute(sql);
		}catch(Exception e) {
			System.err.println("FATAL ERROR: "+e);
		}finally{
			close();
		}
	}
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
}
