package com.au.junit.assignment;


public class Student {
	String name;
	String code;
	String dob;
	Integer totalMarks;
	float percentile;

	
	public float getPercentile() {
		return percentile;
	}
	public void setPercentile(float percentile) {
		this.percentile = percentile;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Student(){
		totalMarks=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

}
