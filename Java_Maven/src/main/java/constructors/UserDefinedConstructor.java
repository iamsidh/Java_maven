package constructors;

public class UserDefinedConstructor {
	
	String name;
	int id;
	
	public UserDefinedConstructor(String name,int id) {
		
		//this is to access class level varibales
		
		this.name=name;
		this.id=id;
		
	}
	
	public static void main(String[] args) {
		
		UserDefinedConstructor ud = new UserDefinedConstructor("Siddhesh", 2);
		
		System.out.println(ud.name);
		System.out.println(ud.id);
		
	}

}
