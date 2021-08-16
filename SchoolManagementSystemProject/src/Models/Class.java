package Models;
public class Class {
	
	private String mondayCourse;
	private String tuesdayCourse;
	private String wednesdayCourse;
	private String thursdayCourse;
	private String fridayCourse;
	
	// Overloaded Constructor
	public Class(String mondayCourse, String tuesdayCourse, String wednesdayCourse, String thursdayCourse, String fridayCourse) {
		this.mondayCourse = mondayCourse;
		this.tuesdayCourse = tuesdayCourse;
		this.wednesdayCourse = wednesdayCourse;
		this.thursdayCourse = thursdayCourse;
		this.fridayCourse = fridayCourse;
	}
	// Getters - Setters
	public String getMondayCourse() {
		return mondayCourse;
	}
	public void setMondayCourse(String mondayCourse) {
		this.mondayCourse = mondayCourse;
	}
	public String getTuesdayCourse() {
		return tuesdayCourse;
	}
	public void setTuesdayCourse(String tuesdayCourse) {
		this.tuesdayCourse = tuesdayCourse;
	}
	public String getWednesdayCourse() {
		return wednesdayCourse;
	}
	public void setWednesdayCourse(String wednesdayCourse) {
		this.wednesdayCourse = wednesdayCourse;
	}
	public String getThursdayCourse() {
		return thursdayCourse;
	}
	public void setThursdayCourse(String thursdayCourse) {
		this.thursdayCourse = thursdayCourse;
	}
	public String getFridayCourse() {
		return fridayCourse;
	}
	public void setFridayCourse(String fridayCourse) {
		this.fridayCourse = fridayCourse;
	}
	
}
