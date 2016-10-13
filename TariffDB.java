package com.airvoice.db;

import java.util.HashMap;

import com.airvoice.core.Tariff;

public class TariffDB {

	public static void dbInsertTariff(Tariff tariffObj){
		DatabaseManager db=new DatabaseManager ( "jdbc:oracle:thin:@localhost:1521:xe","system","Scholar","oracle.jdbc.driver.OracleDriver");
		db.open();
		HashMap<String,String> fieldNameValue= new HashMap<String,String>();
		
		fieldNameValue.put("plan_id",Integer.toString(tariffObj.getPlanId()));
		fieldNameValue.put("plan_name", tariffObj.getPlanName());
		db.insertIntoTable("Tarrif_plan", fieldNameValue);	
	}
	
	public static void dbUpdateTariff(Tariff tariffObj){
		
	}
	
	public static void dbDeleteTariff(Tariff tariffObj){
		
	}
	
	public static void dbGetTariffFromPlanName(String planName){
		
	
	}
	
	public static void dbGetTariffFromPlanId(int planId){
		
			
	}
	
}
