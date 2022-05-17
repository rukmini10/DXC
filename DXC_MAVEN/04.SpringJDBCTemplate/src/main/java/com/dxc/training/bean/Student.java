package com.dxc.training.bean;

public class Student {
	private int rollno;
	private String name;
	private String stream;
	private float avgmarks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public float getAvgmarks() {
		return avgmarks;
	}
	public void setAvgmarks(float avgmarks) {
		this.avgmarks = avgmarks;
	}
	public Student(int rollno, String name, String stream, float avgmarks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.stream = stream;
		this.avgmarks = avgmarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n" + rollno + "," + name + "," + stream + "," + avgmarks;
	}
	
	
}
