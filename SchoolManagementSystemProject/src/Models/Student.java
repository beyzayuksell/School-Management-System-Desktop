package Models;

import java.util.ArrayList;

public class Student {
	
	private String surname;
	private String name;
	private String grade;
	private String age;
	private String fee;
	public ArrayList<Student> studentArr;
	
	// Default Constructor
	public Student(){
		// initialize arrList
		studentArr = new ArrayList<Student>();
	}
	
	// Overloaded Constructor
	public Student(String surname, String name, String grade, String age, String fee)
	{
		this.surname = surname;
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.fee = fee;
	}
	
	// Getters - Setters
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	
	// Update values in Student array list and json file
	public void updateStudentToArryList(int index, String surname, String name, String grade, String age, String fee) {
		studentArr.get(index).setSurname(surname);
		studentArr.get(index).setName(name);
		studentArr.get(index).setGrade(grade);
		studentArr.get(index).setAge(age);
		studentArr.get(index).setFee(fee);
	}
	
	// The same name and surname should not be in the Student list at the same time.
	public boolean checkHaveSameStudent(String surname, String name) {
		for (int i = 0; i < studentArr.size(); i++) {
			if (studentArr.get(i).getSurname().equals(surname) && studentArr.get(i).getName().equals(name)) 
				return false;
		}return true;
	}

	
}
