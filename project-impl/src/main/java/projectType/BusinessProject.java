package projectType;

import java.util.ArrayList;
import java.util.List;

import org.paumard.company.Employee;
import org.paumard.company.Project;

import EmployeeType.ProjectManager;

public class BusinessProject implements Project {

	private String name;
	private Employee head;
	private List<Employee> employees = new ArrayList<>();

	public static class Builder {

		private String name;
		private Employee head;
		private List<Employee> workForce = new ArrayList<>();

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withHead(Employee head) {
			if (head instanceof ProjectManager)
				this.head = head;
			return this;
		}

		public Builder withWorkForce(Employee member) {
			this.workForce.add(member);
			return this;
		}

		public Project build() {

			if (this.workForce.isEmpty()) {
				throw new IllegalArgumentException("the employee list should not be empty");
			}

			BusinessProject project = new BusinessProject();
			project.name = this.name;
			project.head = this.head;
			project.employees.addAll(this.workForce);
			return project;
		}

	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public Employee head() {
		return this.head;
	}

	@Override
	public List<Employee> workForce() {
		return List.copyOf(this.employees);
	}

	@Override
	public String toString() {
		return "BusinessProject [name=" + name + ", head=" + head + ", employees=" + employees + "]";

	}
}