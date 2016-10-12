package com.airvoice.test;

import java.util.HashMap;

import com.airvoice.db.DatabaseManager;

public class DatabaseManagerTest {

	public static void insertTableTest(){
		DatabaseManager db=new DatabaseManager("jdbc:oracle:thin:@localhost:1521:xe","system","Scholar","oracle.jdbc.driver.OracleDriver");
		db.open();
		String id="id";
		String name="name";
		String a="'kumar'";
		
		HashMap<String,String> fieldNameValue=new HashMap<String,String>();
		fieldNameValue.put(id, "4");
		fieldNameValue.put(name,a);
		db.insertIntoTable("shiva_try", fieldNameValue);
		db.close();
		
	}
	public static void main(String[] args) {
		
		insertTableTest();
		
	}

}