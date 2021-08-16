package Models;
public class Student {
	
	private String surname;
	private String name;
	private String grade;
	private String age;
	private String fee;
	
	// Default Constructor
	public Student(){}
	
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
	
}
