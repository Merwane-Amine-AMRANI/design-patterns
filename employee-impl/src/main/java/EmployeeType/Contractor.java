package EmployeeType;

import org.paumard.company.Employee;

public class Contractor implements Employee {

	@Override
	public String toString() {
		return "Contractor [name=" + name + ", age=" + age + "]";
	}

	private String name;
	private int age;

	public Contractor() {
	}

	public Contractor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public int age() {
		return this.age;
	}

}
