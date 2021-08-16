package Controllers;
import Models.Student;
import Models.Teacher;
import Models.SchoolBus;
import Models.Class;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadWriteJson {

	public int std_cnt = 1; // student number
	public int grade_cnt = 1; // grade number
	public int schoolBus_cnt = 1; // school bus number
	public ArrayList<Teacher> teacherArr; 
	public ArrayList<Student> studentArr;
	public ArrayList<Class> classArr;
	public ArrayList<SchoolBus> schoolBusArr;
	public ArrayList<String> stdIds;
	public ArrayList<String> bracnhArr;

	@SuppressWarnings("unchecked")
	public ReadWriteJson() {
		studentArr = new ArrayList<Student>(); // initialize arrList
		teacherArr = new ArrayList<Teacher>();
		classArr = new ArrayList<Class>();
		schoolBusArr = new ArrayList<SchoolBus>();
		stdIds = new ArrayList<String>();
		bracnhArr = new ArrayList<String>();
		// To use parser for parser of data.-> Read to file
		JSONParser jparser = new JSONParser();
		try (FileReader reader = new FileReader("School.json")) {
			// Read JSON File
			Object obj = jparser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray schoolList = new JSONArray();
			schoolList.add(jsonObject);
			schoolList.forEach(stdent -> parseStudentObj((JSONObject) stdent));
			schoolList.forEach(tcher -> parseTeacherObj((JSONObject) tcher));
			schoolList.forEach(grade -> parseClassObj((JSONObject) grade));
			schoolList.forEach(shoolbus -> parseSchoolBusObj((JSONObject) shoolbus));
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}		
	}
	public void parseStudentObj(JSONObject sch) {
		// Read Nested Data, Store to Student Array
		JSONObject somObj = (JSONObject) sch.get("school of music"); // somObj store all objects
		JSONObject studentObj = (JSONObject) somObj.get("student");

		String id = Integer.toString(std_cnt++);
		JSONObject n_Std = (JSONObject) studentObj.get(id);
		do { // if student object is not null
		
			String sname = n_Std.get("surname").toString();
			String name = n_Std.get("name").toString();
			String grade = n_Std.get("grade").toString();
			String age = n_Std.get("age").toString();
			String fee = n_Std.get("fee").toString();
			// Store info of students to Student array
			studentArr.add(new Student(sname, name, grade, age, fee));
			id = Integer.toString(std_cnt++);
			n_Std = (JSONObject) studentObj.get(id);
		} while (n_Std != null);
		std_cnt--;
	}
	// Read Teacher Object from file 
	public void parseTeacherObj(JSONObject sch) {
		JSONObject somObj = (JSONObject) sch.get("school of music"); // somObj store all objects
		JSONObject teacherObj = (JSONObject) somObj.get("teacher");
		JSONObject bracnh = (JSONObject) teacherObj.get("bracnh");		
		// Bracnh object is regex (regular expression)-> I parsed it. 
        //--TR-- Branch adlarýný listede tutmak için bracnh objesindeki bracnh isimlerini depoladým.
        String s = bracnh.toString(); 
	    String[] branchSplitArr = s.split("\"", 0); // Split array all object by " .
        for(int i=0; i<branchSplitArr.length ; i++) {
        	if(branchSplitArr[i].equals(":{")) {
        		int j=i;
        		--j;
        		bracnhArr.add(branchSplitArr[j]); 
        	}
        }              
		if (bracnh != null) {      // this object is not null
			for(int i=0; i<bracnhArr.size(); i++) {
				JSONObject bracnhType = (JSONObject) bracnh.get(bracnhArr.get(i));
				String surname = bracnhType.get("surname").toString();
				String name = bracnhType.get("name").toString();
				String salary = bracnhType.get("salary").toString();
				// Store info of music teacher to Teacher array
				teacherArr.add(new Teacher(surname, name, salary, bracnhArr.get(i)));
			}			
		} 	
	}
	// Read Class Object from file 
	public void parseClassObj(JSONObject sch) {
		JSONObject somObj = (JSONObject) sch.get("school of music");
		JSONObject classObj = (JSONObject) somObj.get("class");
		JSONObject gradeObj = (JSONObject) classObj.get("grade");
		String grd_id = Integer.toString(grade_cnt++);
		JSONObject n_Grd = (JSONObject) gradeObj.get(grd_id);
		do { // if grade object is not null
			String mondayCourse = n_Grd.get("monday").toString();
			String tuesdayCourse = n_Grd.get("tuesday ").toString();
			String wednesdayCourse = n_Grd.get("wednesday").toString();
			String thursdayCourse = n_Grd.get("thursday").toString();
			String fridayCourse = n_Grd.get("friday").toString();
			// Store info of grades to class array list
			classArr.add(new Class(mondayCourse, tuesdayCourse, wednesdayCourse, thursdayCourse, fridayCourse));
			grd_id = Integer.toString(grade_cnt++);
			n_Grd = (JSONObject) gradeObj.get(grd_id);
		} while (n_Grd != null);
		grade_cnt--;
	}
	// Read School Bus Object from file 
	public void parseSchoolBusObj(JSONObject sch) {
		JSONObject somObj = (JSONObject) sch.get("school of music");
		JSONObject schBusObj = (JSONObject) somObj.get("school bus");	
		String schBusID = Integer.toString(schoolBus_cnt++);
		JSONObject n_schBusID = (JSONObject) schBusObj.get(schBusID); 	
		while (n_schBusID != null) {
			if(n_schBusID != null) {
				JSONArray stdDd_List = (JSONArray) n_schBusID.get("students");
				stdIds = new ArrayList<String>();
				for(int i=0; i < stdDd_List.size(); i++) 			
					stdIds.add((String) stdDd_List.get(i)); // add student id's to student array list
			}
			String capacity = n_schBusID.get("capacity").toString();
			String status = n_schBusID.get("status").toString();
			String arrived = n_schBusID.get("arrived").toString();
			schBusID = Integer.toString(schoolBus_cnt++);
			n_schBusID = (JSONObject) schBusObj.get(schBusID);	
			// Store info of schoolBus to schoolBus array list
			schoolBusArr.add(new SchoolBus(capacity, status, arrived, stdIds));
		}
		schoolBus_cnt--;
	}
	// Write all objects to file
	@SuppressWarnings("unchecked")
	public void WriteJsonFile() {
		try {

			int std_id = 1 , grade_id = 1, schoolbus_id = 1;
			JSONObject som = new JSONObject();
			JSONObject schoolAreas = new JSONObject();		
			// Write student to file
			JSONObject std_num = new JSONObject();
			for (int i = 0; i < studentArr.size(); i++) {
				JSONObject single_std = new JSONObject();
				single_std.put("Surname", studentArr.get(i).getSurname());
				single_std.put("Name", studentArr.get(i).getName());
				single_std.put("Grade", studentArr.get(i).getGrade());
				single_std.put("Age", studentArr.get(i).getAge());
				single_std.put("Fee", studentArr.get(i).getFee());
				std_num.put(std_id, single_std);
				std_id++;
			}  
			// Write teacher to file	
			JSONObject bracnh = new JSONObject();
			for(int i=0; i<teacherArr.size(); i++) {
				JSONObject bracnhTypeSingle = new JSONObject();
				bracnhTypeSingle.put("surname", teacherArr.get(i).getSurname());
				bracnhTypeSingle.put("name", teacherArr.get(i).getName());
				bracnhTypeSingle.put("salary", teacherArr.get(i).getSalary());
				bracnh.put(teacherArr.get(i).getBranch(), bracnhTypeSingle);
			}		
			// Write class to file 
			JSONObject classg = new JSONObject();
			JSONObject grade = new JSONObject();
			for (int i = 0; i < classArr.size(); i++) {
				JSONObject grade_num = new JSONObject();
				grade_num.put("monday", classArr.get(i).getMondayCourse());
				grade_num.put("tuesday ", classArr.get(i).getTuesdayCourse());
				grade_num.put("wednesday", classArr.get(i).getWednesdayCourse());
				grade_num.put("thursday", classArr.get(i).getThursdayCourse());
				grade_num.put("friday", classArr.get(i).getFridayCourse());
				grade.put(grade_id, grade_num);
				grade_id++;
			}
			classg.put("grade", grade); 
			// Write school bus to file	
			JSONObject schoolbus = new JSONObject();		
			for (int i = 0; i < schoolBusArr.size(); i++) {
				JSONObject schbus_single = new JSONObject();
				schbus_single.put("capacity", schoolBusArr.get(i).getCapacity());
				schbus_single.put("status", schoolBusArr.get(i).getStatus());
				schbus_single.put("arrived", schoolBusArr.get(i).getArrived());
				schbus_single.put("students", schoolBusArr.get(i).getStudentsIDs());
				schoolbus.put(schoolbus_id, schbus_single);
				schoolbus_id++;
			}
			schoolAreas.put("teacher", bracnh);
			schoolAreas.put("student", std_num);
			schoolAreas.put("class", classg);
			schoolAreas.put("school bus", schoolbus);
			som.put("school of music", schoolAreas);
			// Create a new File 
			FileWriter fileWriter = new FileWriter("UpdateSchool.json");
			// Write the jsonObject into UpdateSchool.json file
			fileWriter.write(som.toJSONString());               
			fileWriter.close();
			System.out.println("JSON Object Successfully written to the file!!");
			System.out.println("--Updated Json File:--\n\n"+som);                //---Control---
		} catch (Exception e) { e.printStackTrace(); }
	}
	// Update values in Student array list and json file
	public void updateStudentToArryList(int index, String surname, String name, String grade, String age, String fee) {
		studentArr.get(index).setSurname(surname);
		studentArr.get(index).setName(name);
		studentArr.get(index).setGrade(grade);
		studentArr.get(index).setAge(age);
		studentArr.get(index).setFee(fee);
		WriteJsonFile(); // Method calls.. //-- Update Json file	
	}
	// Update values in Teacher array list and json file
	public void updateTeacherToArryList(String surname, String name, String salary, String bracnh_type) {
		int bracnh_index; // I used like id.
		for(int i=0; i<bracnhArr.size(); i++) {
			if(bracnh_type.equals(bracnhArr.get(i))) {
				bracnh_index = i;
			    teacherArr.get(bracnh_index).setSurname(surname);
			    teacherArr.get(bracnh_index).setName(name);
			    teacherArr.get(bracnh_index).setSalary(salary);
			    WriteJsonFile(); // Method calls.. //-- Update Json file
			}
		}		
		WriteJsonFile(); // Method calls.. //-- Update Json file
	}
	// Update values in Class array list and json file
	public void updateClassToArryList(int index, java.lang.String monday, java.lang.String tuesday,
			java.lang.String wday2, java.lang.String thursday, java.lang.String friday) {
		classArr.get(index).setMondayCourse(monday);
		classArr.get(index).setTuesdayCourse(tuesday);
		classArr.get(index).setWednesdayCourse(wday2);
		classArr.get(index).setThursdayCourse(thursday);
		classArr.get(index).setFridayCourse(friday);
		WriteJsonFile(); // Method calls.. //-- Update Json file
	}
	// The same name and surname should not be in the Student list at the same time.
	public boolean checkHaveSameStudent(String surname, String name) {
		for (int i = 0; i < studentArr.size(); i++) {
			if (studentArr.get(i).getSurname().equals(surname) && studentArr.get(i).getName().equals(name)) 
				return false;
		}return true;
	}
	// The same name and surname should not be in the Teacher list at the same time.
	public boolean checkHaveSameTeacher(String surname, String name) {
		for (int i = 0; i < teacherArr.size(); i++) {
			if (teacherArr.get(i).getSurname().equals(surname.toLowerCase()) && teacherArr.get(i).getName().equals(name.toLowerCase())) 
				return false;
		}return true;
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
}