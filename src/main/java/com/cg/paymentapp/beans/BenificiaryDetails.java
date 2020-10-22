package com.cg.paymentapp.beans;

public class BenificiaryDetails {

	private int benificiaryId;
	private String name;
	private String mobileNumber;
	
	public int getBenificiaryId() {
		return benificiaryId;
	}
	public void setBenificiaryId(int benificiaryId) {
		this.benificiaryId = benificiaryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "BenificiaryDetails [benificiaryId=" + benificiaryId + ", name=" + name + ", mobileNumber="
				+ mobileNumber + "]";
	}

}

