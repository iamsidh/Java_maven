package database_apps.student_manager;

public class Students {
	
	private String first_name;
	private String last_name;
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	@Override
	public String toString() {
		return "Students [first_name=" + first_name + ", last_name=" + last_name + "]";
	}


	public Students(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	

}
