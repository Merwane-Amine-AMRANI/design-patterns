package EmployeeType;

import org.paumard.company.Employee;

public class DepartmentManager implements Employee {

	public DepartmentManager() {
	}

	@Override
	public String toString() {
		return "DepartmentManager [name()=" + name() + ", age()=" + age() + "]";
	}

	private String name;
	private int age;

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
	public String name() {
		return this.name;
	}

	@Override
	public int age() {
		return this.age;
	}

}
