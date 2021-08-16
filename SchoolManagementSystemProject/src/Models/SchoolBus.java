package Models;
import java.util.ArrayList;

public class SchoolBus {
	
	private String capacity;
	private String status;
	private String arrived;
	private ArrayList<String> studentsIDs;
	

	public SchoolBus(String capacity, String status, String arrived) {
		this.capacity = capacity;
		this.status = status;
		this.arrived = arrived;
	}

	public SchoolBus(String capacity, String status, String arrived, ArrayList<String> studentsIDs) {
		this.capacity = capacity;
		this.status = status;
		this.arrived = arrived;
		this.studentsIDs = studentsIDs;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getArrived() {
		return arrived;
	}

	public void setArrived(String arrived) {
		this.arrived = arrived;
	}

	public ArrayList<String> getStudentsIDs() {
		return studentsIDs;
	}

	public void setStudentsIDs(ArrayList<String> students) {
		this.studentsIDs = students;
	}

	
	
}
