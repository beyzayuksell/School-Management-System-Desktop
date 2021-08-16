package Models;
public class Teacher {
	
	private String surname;
	private String name;
	private String salary;
	private String branch;
	
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

	

}
