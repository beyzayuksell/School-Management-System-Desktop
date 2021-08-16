package Models;

import java.util.ArrayList;

public class Teacher {
	
	private String surname;
	private String name;
	private String salary;
	private String branch;
	public ArrayList<Teacher> teacherArr;
	public ArrayList<String> bracnhArr;
	
	public Teacher() {
		teacherArr = new ArrayList<Teacher>();
		bracnhArr = new ArrayList<String>();
	}
	
	// Overloaded Constructor
	public Teacher(String surname, String name, String salary, String branch)
	{
		this.surname = surname;
		this.name = name;
		this.salary = salary;
		this.branch = branch;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	// The same name and surname should not be in the Teacher list at the same time.
	public boolean checkHaveSameTeacher(String surname, String name) {
		for (int i = 0; i < teacherArr.size(); i++) {
			if (teacherArr.get(i).getSurname().equals(surname.toLowerCase()) && teacherArr.get(i).getName().equals(name.toLowerCase())) 
				return false;
		}return true;
	}


}
