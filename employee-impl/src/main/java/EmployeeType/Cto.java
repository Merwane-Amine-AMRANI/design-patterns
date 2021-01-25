package EmployeeType;

import org.paumard.company.Employee;

public class Cto implements Employee {
	private String name;
	private int age;

	private Cto() {
	}

	private static Cto INSTANCE = new Cto();

	public static Cto getInstance() {
		return INSTANCE;
	}

	public void setName(String name) {
		INSTANCE.name = name;
	}

	public void setAge(int age) {
		INSTANCE.age = age;
	}

	@Override
	public String name() {
		return INSTANCE.name;
	}

	@Override
	public int age() {
		return INSTANCE.age;
	}

	@Override
	public String toString() {
		return "Cto [name()=" + name() + ", age()=" + age() + "]";
	}

}
