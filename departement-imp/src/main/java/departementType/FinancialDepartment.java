package departementType;

import java.util.ArrayList;
import java.util.List;

import org.paumard.company.Department;
import org.paumard.company.Employee;
import org.paumard.company.Project;

import EmployeeType.DepartmentManager;
import EmployeeType.FullTime;
import projectType.FinanceProject;

public class FinancialDepartment implements Department {

	private Employee head;
	private List<Employee> listeManagers = new ArrayList<Employee>();
	private List<Project> listeProjects = new ArrayList<Project>();

	public static class Builder {

		private Employee head;
		private List<Employee> listeManagers = new ArrayList<>();
		private List<Project> listeProjects = new ArrayList<>();;

		public Builder withHead(Employee head) {
			if(head instanceof DepartmentManager)
				this.head = head;
			return this;
		}

		public Builder withManagementMember(Employee manager) {
			if(manager instanceof FullTime)
				this.listeManagers.add(manager);
			return this;
		}

		public Builder withProject(Project project) {
			if(project instanceof FinanceProject)
				this.listeProjects.add(project);
			return this;
		}

		public Department build() {
			FinancialDepartment department = new FinancialDepartment();
			department.head = this.head;
			department.listeManagers.addAll(this.listeManagers);
			department.listeProjects.addAll(this.listeProjects);
			return department;
		}

	}

	@Override
	public Employee head() {
		return this.head;
	}

	@Override
	public List<Employee> managers() {
		return List.copyOf(this.listeManagers );
	}

	@Override
	public List<Project> projects() {
		return List.copyOf(this.listeProjects);
	}

	@Override
	public String toString() {
		return "FinancialDepartment [head=" + head + ", listeManagers=" + listeManagers + ", listeProjects="
				+ listeProjects + "]";
	}


}
