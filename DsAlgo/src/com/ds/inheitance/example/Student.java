package com.ds.inheitance.example;

public class Student extends Person {

	private int studentId;
	private String courseName;

	public Student() {

	}

	public Student(String name, int age, int studentId, String courseName) {

		super(name, age);
		this.studentId = studentId;
		this.courseName = courseName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public void work() {

		System.out.println("The student name is" + getName() + ", And his age is:" + getAge() + ", studentId is:"
				+ studentId + ", CourseName:" + courseName);
	}

}
