package com.airvoice.test;

import java.util.HashMap;

import com.airvoice.db.DatabaseManager;

public class DatabaseManagerTest {

	public static void insertTableTest(){
		DatabaseManager db=new DatabaseManager("jdbc:oracle:thin:@localhost:1521:orcl",
				"hr","shiva123","oracle.jdbc.OracleDriver");
		System.out.println("test");
		db.open();
		HashMap<String,String> fieldNameValue=new HashMap<String,String>();
		fieldNameValue.put("id", "2");
		fieldNameValue.put("name","Vivek");
		db.insertIntoTable("shiva1", fieldNameValue);
		db.close();
		
	}
	public static void main(String[] args) {
		System.out.println("Test");
		insertTableTest();
		System.out.println("Test1");
	}

}
