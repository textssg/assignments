package com.airvoice.core;

import java.util.Date;

public class Tariff {
	
	private int planId;
	private String planName;
	private boolean planActive;
	private Date planActivationOrDeactivationDate;
	
	private int planActivationFee;
	private int planSecurityDeposit;
	private int monthlyRental;
	
	private int freeLocal;
	private int freeSTD;
	private int freeNationalSMS;
	private int freeInternationalSMS;
	
	private int outgoingLocalWithinNetwork; // 		120p/min (2p/sec)
	private int outgoingLocalOutsideNetworkMobile;// 120p/min (2p/sec)
	private int outgoingLocalOutsideNetworkLandline;//120p/min	(2p/sec)
	private int outgoingSTD; //2p/sec
	private int outgoingISD; //	usa 8rs/min
	private int outgoingLocalRoamingNational; //0.8/min
	private int outgoingSTDRoamingNational;  //1.15/min
	private int outgoingLocalRoamingInternational;	//cant find
	private int outgoingSTDRoamingInternational;	//cannot find
	private int incomingNormal; //free
	private int incomingNationalRoaming; //0.45p/min
	private int incomingInternationalRoaming; 	//cannotfind
	

	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public void setPlanActive(boolean planActive) {
		this.planActive = planActive;
	}
	public void setPlanActivationOrDeactivationDate(Date planActivationOrDeactivationDate) {
		this.planActivationOrDeactivationDate = planActivationOrDeactivationDate;
	}
	public void setPlanActivationFee(int planActivationFee) {
		this.planActivationFee = planActivationFee;
	}
	public void setPlanSecurityDeposit(int planSecurityDeposit) {
		this.planSecurityDeposit = planSecurityDeposit;
	}
	public void setMonthlyRental(int monthlyRental) {
		this.monthlyRental = monthlyRental;
	}
	public void setFreeLocal(int freeLocal) {
		this.freeLocal = freeLocal;
	}
	public void setFreeSTD(int freeSTD) {
		this.freeSTD = freeSTD;
	}
	public void setFreeNationalSMS(int freeNationalSMS) {
		this.freeNationalSMS = freeNationalSMS;
	}
	public void setFreeInternationalSMS(int freeInternationalSMS) {
		this.freeInternationalSMS = freeInternationalSMS;
	}
	public void setOutgoingLocalWithinNetwork(int outgoingLocalWithinNetwork) {
		this.outgoingLocalWithinNetwork = outgoingLocalWithinNetwork;
	}
	public void setOutgoingLocalOutsideNetworkMobile(int outgoingLocalOutsideNetworkMobile) {
		this.outgoingLocalOutsideNetworkMobile = outgoingLocalOutsideNetworkMobile;
	}
	public void setOutgoingLocalOutsideNetworkLandline(int outgoingLocalOutsideNetworkLandline) {
		this.outgoingLocalOutsideNetworkLandline = outgoingLocalOutsideNetworkLandline;
	}
	public void setOutgoingSTD(int outgoingSTD) {
		this.outgoingSTD = outgoingSTD;
	}
	public void setOutgoingISD(int outgoingISD) {
		this.outgoingISD = outgoingISD;
	}
	public void setOutgoingLocalRoamingNational(int outgoingLocalRoamingNational) {
		this.outgoingLocalRoamingNational = outgoingLocalRoamingNational;
	}
	public void setOutgoingSTDRoamingNational(int outgoingSTDRoamingNational) {
		this.outgoingSTDRoamingNational = outgoingSTDRoamingNational;
	}
	public void setOutgoingLocalRoamingInternational(int outgoingLocalRoamingInternational) {
		this.outgoingLocalRoamingInternational = outgoingLocalRoamingInternational;
	}
	public void setOutgoingSTDRoamingInternational(int outgoingSTDRoamingInternational) {
		this.outgoingSTDRoamingInternational = outgoingSTDRoamingInternational;
	}
	public void setIncomingNormal(int incomingNormal) {
		this.incomingNormal = incomingNormal;
	}
	public void setIncomingNationalRoaming(int incomingNationalRoaming) {
		this.incomingNationalRoaming = incomingNationalRoaming;
	}
	public void setIncomingInternationalRoaming(int incomingInternationalRoaming) {
		this.incomingInternationalRoaming = incomingInternationalRoaming;
	}
	public int getPlanId() {
		return planId;
	}
	public String getPlanName() {
		return planName;
	}
	public boolean isPlanActive() {
		return planActive;
	}
	public Date getPlanActivationOrDeactivationDate() {
		return planActivationOrDeactivationDate;
	}
	public int getPlanActivationFee() {
		return planActivationFee;
	}
	public int getPlanSecurityDeposit() {
		return planSecurityDeposit;
	}
	public int getMonthlyRental() {
		return monthlyRental;
	}
	public int getFreeLocal() {
		return freeLocal;
	}
	public int getFreeSTD() {
		return freeSTD;
	}
	public int getFreeNationalSMS() {
		return freeNationalSMS;
	}
	public int getFreeInternationalSMS() {
		return freeInternationalSMS;
	}
	public int getOutgoingLocalWithinNetwork() {
		return outgoingLocalWithinNetwork;
	}
	public int getOutgoingLocalOutsideNetworkMobile() {
		return outgoingLocalOutsideNetworkMobile;
	}
	public int getOutgoingLocalOutsideNetworkLandline() {
		return outgoingLocalOutsideNetworkLandline;
	}
	public int getOutgoingSTD() {
		return outgoingSTD;
	}
	public int getOutgoingISD() {
		return outgoingISD;
	}
	public int getOutgoingLocalRoamingNational() {
		return outgoingLocalRoamingNational;
	}
	public int getOutgoingSTDRoamingNational() {
		return outgoingSTDRoamingNational;
	}
	public int getOutgoingLocalRoamingInternational() {
		return outgoingLocalRoamingInternational;
	}
	public int getOutgoingSTDRoamingInternational() {
		return outgoingSTDRoamingInternational;
	}
	public int getIncomingNormal() {
		return incomingNormal;
	}
	public int getIncomingNationalRoaming() {
		return incomingNationalRoaming;
	}
	public int getIncomingInternationalRoaming() {
		return incomingInternationalRoaming;
	}
	
}
