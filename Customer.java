package com.airvoice.core;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;

public class Customer {
	private int customerId;
	private int mobileNumber;
	private String name;
	private String address;
	private int pincode;
	
	enum tariffPlanName{
		RED_260,
		RED_310,
		RED_499,
		RED_699,
		RED_999;
	}
	
	private String tariffPlanName;
	private boolean subsciptionActive;
	private Date activationDate;
	private Date deactivationDate;
	
	
	Customer(){
		
	}
	
	Customer(String name, String address, int pincode, String planName){
		this.name=name;
		this.address=address;
		this.pincode=pincode;
		this.tariffPlanName=planName;
	}
	
	private boolean isMobileNumberInUse(int mobileNumber){
		
		
		return false;
	}
	
	public void allocateMobileNumber(){

        Random rand = new Random();
        int num1 = 612;
        int num2 = rand.nextInt(1000);
        int num3 = rand.nextInt(1000);
        DecimalFormat df3 = new DecimalFormat("0000"); // 3 zeros
        String phoneNumber = num1  + df3.format(num2) + df3.format(num3);
       System.out.println(phoneNumber);
      //this.mobileNumber=Integer.parseInt(phoneNumber.trim());
	}
	
	public void setCustomerId(int CustomerID){
		
	}
	
	public boolean setMobileNumber (int mobileNumber){
		return false;
	}
	
	public void setName (String name){
		
	}
	
	public void setPincode(int pincode){
		
	}
	
	public void setTariffPlan(tariffPlanName plan){
		
	}
	
	public void setSubcriptionActive(boolean status){
		
	}
	
	public void setActivationDate (Date date){
		
	}
	
	public void setDeactivationDate (Date date){
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getPincode() {
		return pincode;
	}

	public String getTariffPlanName() {
		return tariffPlanName;
	}

	public boolean isSubsciptionActive() {
		return subsciptionActive;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public Date getDeactivationDate() {
		return deactivationDate;
	}
}
