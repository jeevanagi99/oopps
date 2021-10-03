package com.X_workz.oops;

public class PhonePe {

	long phoneNo;
	int adharNo;
	String panNo;
	String name;
	String place;

	public PhonePe(String name, long phoneNo, String place, int adharNo) {
		System.out.println("Registration successfully");
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
		this.adharNo = adharNo;
	}

	public PhonePe(String name, long phoneNo, String place, String panNo) {
		System.out.println("Registration successfully");
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
		this.panNo = panNo;
	}

	public PhonePe(String name, long phoneNo, String place, int adharNo, String panNo) {
		System.out.println("Registration successfully");
		this.name = name;
		this.phoneNo = phoneNo;
		this.place = place;
		this.adharNo = adharNo;
		this.panNo = panNo;
	}

	public void displayInfo() {

		System.out.println(this.name);
		System.out.println(this.phoneNo);
		System.out.println(this.panNo);
		System.out.println(this.adharNo);
		System.out.println(this.place);
	}
}
