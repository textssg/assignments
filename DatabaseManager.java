package com.airvoice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DatabaseManager {

	private String dbURL;
	private String userName;
	private String password;
	private String driver;
	private Connection connection;
	
	public DatabaseManager(String dbURL,String userName,String password,
			String driver){
		this.dbURL=dbURL;
		this.userName=userName;
		this.password=password;
		this.driver=driver;
	}
	
	public void open() /*throws exception*/{
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(dbURL,userName,password);
			System.out.println("Database has been connected");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void close(){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void insertIntoTable(String tableName, HashMap<String,String> fieldNameValue){
		StringBuffer sb=new StringBuffer();
		sb.append("insert into "+tableName+" ( ");
		 Iterator it = fieldNameValue.entrySet().iterator();
	      while(it.hasNext()) {
	         Map.Entry pair = (Map.Entry)it.next();
	         sb.append(pair.getKey());
	         if(it.hasNext()) {
	           sb.append(", ");
	         }
	      }
	    sb.append(" ) values ( ");
	    it=fieldNameValue.entrySet().iterator();
	    while(it.hasNext()){
	    	Map.Entry pair= (Map.Entry)it.next();
	    	sb.append(pair.getValue());
	    	if(it.hasNext()){
	    		sb.append(", ");
	    	}
	    }
	    sb.append(" ) ");
	    try {
	    	System.out.println(sb.toString());
			PreparedStatement s=connection.prepareStatement(sb.toString());
			s.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}