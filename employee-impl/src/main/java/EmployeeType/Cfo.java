package EmployeeType;

import org.paumard.company.Employee;

public class Cfo implements Employee {
	private String name;
	private int age;

	private Cfo() {
	}

	private static Cfo INSTANCE = new Cfo();

	public static Cfo getInstance() {
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
		// TODO Auto-generated method stub
		return INSTANCE.age;
	}

	@Override
	public String toString() {
		return "Cfo [name()=" + name() + ", age()=" + age() + "]";
	}

}
