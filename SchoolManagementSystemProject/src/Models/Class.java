package Models;

import java.util.ArrayList;

public class Class {
	
	private String mondayCourse;
	private String tuesdayCourse;
	private String wednesdayCourse;
	private String thursdayCourse;
	private String fridayCourse;
	public ArrayList<Class> classArr;
	
	public Class() { 
		classArr = new ArrayList<Class>();
	}
	
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
	// The same all days should not be in the Class list at the same time.
	public boolean checkHaveSameClass(String mday, String tuesday, String wday, String thursday, String fday) {
		for (int i = 0; i < classArr.size(); i++) {
			if (classArr.get(i).getWednesdayCourse().equals(wday.toLowerCase()) && classArr.get(i).getFridayCourse().equals(fday.toLowerCase()) &&
					classArr.get(i).getMondayCourse().equals(mday.toLowerCase()) && classArr.get(i).getThursdayCourse().equals(thursday.toLowerCase()) && 
					classArr.get(i).getTuesdayCourse().equals(tuesday.toLowerCase()))
				return false;
		}return true;
	}
	// Update values in Class array list and json file
	public void updateClassList(int index, java.lang.String monday, java.lang.String tuesday,
			java.lang.String wday2, java.lang.String thursday, java.lang.String friday) {
		classArr.get(index).setMondayCourse(monday);
		classArr.get(index).setTuesdayCourse(tuesday);
		classArr.get(index).setWednesdayCourse(wday2);
		classArr.get(index).setThursdayCourse(thursday);
		classArr.get(index).setFridayCourse(friday);
	}
}
