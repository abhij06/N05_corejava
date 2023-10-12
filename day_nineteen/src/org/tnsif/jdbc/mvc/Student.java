package org.tnsif.jdbc.mvc;

public class Student
{
	private int rollNo;
	@Override
	public String toString() {
		return rollNo+"\t"+sname+"\t"+per;
	}
	public Student(int rollNo, String sname, Float per) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
		this.per = per;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Float getPer() {
		return per;
	}
	public void setPer(Float per) {
		this.per = per;
	}
	private String sname;
	private Float per;
}
