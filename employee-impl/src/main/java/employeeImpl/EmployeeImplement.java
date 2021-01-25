package employeeImpl;

import org.paumard.company.Employee;

public class EmployeeImplement implements Employee {

	private String name;   
	private int age; 
	
	public static Builder newBuilder() {
		return new Builder();
	}
	
	public static class Builder{
		private String name;  
		private int age;  
		
		public Builder withName(String name){
			this.name = name;  
			return this;  
		}
		public Builder withAge(int age) {
			this.age = age; 
			return this;  
		}
		public Employee build() {
			EmployeeImplement  employee= new EmployeeImplement(); 
			employee.name = name;  
			employee.age = age;  
			return employee;  
		}
	}
	
	public EmployeeImplement() {
	
		
	}

	public EmployeeImplement(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String name() {
		
		return this.name; 
	}

	public int age() {
		return this.age;  
	}

	@Override
	public String toString() {
		return "EmployeeImplement [name=" + name + ", age=" + age + "]";
	}


}
