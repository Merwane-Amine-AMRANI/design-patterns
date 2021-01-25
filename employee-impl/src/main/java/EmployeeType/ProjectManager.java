package EmployeeType;

import org.paumard.company.Employee;

public class ProjectManager implements Employee {

	@Override
	public String toString() {
		return "ProjectManager [name=" + name + ", age=" + age + "]";
	}

	private String name;
	private int age;

	public ProjectManager() {
	}

	public ProjectManager(String name, int age) {
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
