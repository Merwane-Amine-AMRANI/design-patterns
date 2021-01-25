package EmployeeType;

import org.paumard.company.Employee;

public class Ceo implements Employee {

	private String name;
	private int age;

	private Ceo() {
	}

	private static Ceo INSTANCE = new Ceo();

	public static Ceo getInstance() {
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
		return "Ceo [name()=" + name() + ", age()=" + age() + "]";
	}

}
