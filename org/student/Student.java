package org.student;
 import org.department.Department;
public class Student extends Department {
	public void studentName() {
		System.out.println(" Iyappan");
	}
public void studentDept() {
	System.out.println("Computer Science ");
}
	public void studentId() {
		System.out.println("345");
	}
 public static void main(String[] args) {
	Student details =new Student();
	details.collegeName();
	details.collegeCode();
	details.collegeRank();
	details.deptName();
	details.studentName();
	details.studentDept();
	details.studentId();
}
}
