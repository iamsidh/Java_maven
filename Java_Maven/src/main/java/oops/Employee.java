package oops;

public class Employee {
	
	//instance / class level variables
	
	int empID;
	String empName;
	String empCity;
	String empPost;
	int empSal;
	
	public Employee() {
		
		System.out.println("This is default constructor");
	}
	
	public Employee(int id,String name,String city,String post,int sal) {
		
		this.empID=id;
		this.empName=name;
		this.empCity=city;
		this.empPost=post;
		this.empSal=sal;
	
	}
	
	
	public void empInformation() {
		
		System.out.println("Employee id is :"+empID);
		System.out.println("Employee Name is :"+empName);
		System.out.println("Employee City is :"+empCity);
		System.out.println("Employee Post is :"+empPost);
		System.out.println("Employee Salary is :"+empSal);
	}

}
