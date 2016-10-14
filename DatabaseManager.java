package com.airvoice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	    	System.out.println(fieldNameValue.size());
			PreparedStatement s=connection.prepareStatement(sb.toString());
			int j=s.executeUpdate();
			if(j>0)
			{
				System.out.println(j);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet selectAllFromTable(String tableName, HashMap<String,String> fieldNameValue) throws SQLException{
		
		StringBuffer sb=new StringBuffer();
		sb.append("select * from " +tableName+ " where " );
		Iterator it=fieldNameValue.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair= (Map.Entry)it.next();
			sb.append(pair.getKey() + " = " + pair.getValue());
			if(it.hasNext()){
				sb.append(", ");
			}
		}
		
			System.out.println(sb.toString());
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(sb.toString());
			return rs;

	}
	
public void updateInTable(String tableName,HashMap<String,String> fieldValues,int id){
		
		StringBuffer sb=new StringBuffer();
		sb.append("update " +tableName+ " set ");
		Iterator it=fieldValues.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair=(Map.Entry)it.next();
			sb.append(pair.getKey()+ " = " + pair.getValue());
			if(it.hasNext()){
				sb.append(",");
			}
		}
				sb.append("  where  customer_id ="+id);
	    try {
	    	System.out.println(sb.toString());
			PreparedStatement s=connection.prepareStatement(sb.toString());
			s.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
			
		}
	public void deleteTable(String tableName,HashMap<String,String> fieldvalue , int id ){
		StringBuffer sb=new StringBuffer();
		sb.append(" delete from " + tableName );
	 Iterator it=fieldvalue.entrySet().iterator();
	 while(it.hasNext()){
		 Map.Entry pair=(Map.Entry)it.next();
		 sb.append(pair.getKey());
		 if(it.hasNext()){
			 sb.append(" ' '");
		 }
		 sb.append("  where customer_id = " +" "  + id);
	 }
	 try {
	    	System.out.println(sb.toString());
			PreparedStatement s=connection.prepareStatement(sb.toString());
			s.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
	
}