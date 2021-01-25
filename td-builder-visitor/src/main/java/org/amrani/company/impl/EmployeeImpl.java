package org.amrani.company.impl;

import org.amrani.company.Employee;

public class EmployeeImpl implements Employee {

	private String name;
	private int age;
	private int salary;
	
	public static Builder newBuilder() {
		
		return new Builder();
	}

	public static class Builder {
		private String name;
		private int age;
		private int salary;

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder withSalary(int salary) {
			this.salary = salary;
			return this;
		}

		public Employee Build() {
			EmployeeImpl employee = new EmployeeImpl();
			employee.age = age;
			employee.name = name;
			employee.salary  = salary;
			return employee;
		}

	

	}

	public EmployeeImpl() {

	}

	public EmployeeImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String name() {
		return this.name;
	}

	public int age() {
		return this.age;
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
	
	@Override
	public String toString() {
		return "EmployeeImpl [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

}
