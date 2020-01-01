package com.student.beans;
public class Student {
	private int studentID;
	private String name;
	private Studentmarks[] studentmarks;
	private double average;
	private double totalmarks;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Studentmarks[] getStudentmarks() {
		return studentmarks;
	}
	public void setStudentmarks(Studentmarks[] studentmarks) {
		this.studentmarks = studentmarks;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}
	
}
