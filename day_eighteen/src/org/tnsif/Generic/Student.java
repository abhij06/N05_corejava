package org.tnsif.Generic;

public class Student {
	int Id;
	String name;
	float marks;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Student(int id, String name, float marks) {
		super();
		Id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
