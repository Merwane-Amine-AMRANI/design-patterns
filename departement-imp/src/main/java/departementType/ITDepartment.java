package departementType;

import java.util.ArrayList;
import java.util.List;

import org.paumard.company.Department;
import org.paumard.company.Employee;
import org.paumard.company.Project;

import EmployeeType.DepartmentManager;
import EmployeeType.FullTime;
import projectType.BusinessProject;
import projectType.DBProject;
import projectType.WebProject;

public class ITDepartment implements Department {

	private Employee head;
	private List<Employee> managers = new ArrayList<Employee>();
	private List<Project> projects = new ArrayList<Project>();

	public static Builder newBuilder() {

		return new Builder();
	}

	public static class Builder {

		private Employee head;
		private List<Employee> managers = new ArrayList<Employee>();
		private List<Project> projects = new ArrayList<Project>();

		public Builder withHead(Employee head) {
			if (head instanceof DepartmentManager)
				this.head = head;
			return this;
		}

		public Builder withListManagers(Employee manager) {
			if (manager instanceof FullTime)
				this.managers.add(manager);
			return this;
		}

		public Builder withProject(Project project) {
			if (project instanceof WebProject || project instanceof DBProject || project instanceof BusinessProject)
				this.projects.add(project);
			return this;
		}

		public Department build() {
			ITDepartment department = new ITDepartment();
			department.head = this.head;
			department.managers.addAll(this.managers);
			department.projects.addAll(this.projects);
			return department;
		}

	}

	@Override
	public Employee head() {
		return this.head;
	}

	@Override
	public List<Employee> managers() {
		return List.copyOf(this.managers);
	}

	@Override
	public List<Project> projects() {
		return List.copyOf(this.projects);
	}

	@Override
	public String toString() {
		return "ITDepartment [head=" + head + ", listeManagers=" + managers + ", listeProjects=" + projects + "]";
	}

}
