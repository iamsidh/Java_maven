package oops;

public class EmpExecutor {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.empID=1;
		e.empName="Siddhesh";
		e.empCity="Malvan";
		e.empPost="Software Tester";
		e.empSal=50000;
		
		e.empInformation();
		
		Employee e2 = new Employee(2,"Sagar","Sawantwadi","Web Dev",60000);
		
		e2.empInformation();
		
	}

}
