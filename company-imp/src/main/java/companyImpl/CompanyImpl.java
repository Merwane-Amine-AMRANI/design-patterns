package companyImpl;

import java.util.ArrayList;
import java.util.List;

import org.paumard.company.Company;
import org.paumard.company.Department;
import org.paumard.company.Employee;

public class CompanyImpl implements Company {
	
	private String name;
	private List<Department> departments= new ArrayList<>();
	

	private Employee ceo, cfo, cto;
	
	public static class Builder {

		private String name;
		private List<Department> departments = new ArrayList<>();
		private Employee ceo, cfo, cto;

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withCeo(Employee ceo) {
			this.ceo = ceo;
			return this;
		}

		public Builder withCto(Employee cto) {
			this.cto = cto;
			return this;
		}
		
		public Builder withCfo(Employee cfo) {
			this.cfo = cfo;
			return this;
		}
		
		public Builder withDepartments(Department department) {
			this.departments.add(department);
			return this;
		}

		public Company build() {

			if (this.departments.isEmpty()) {
				throw new IllegalArgumentException("the employee list should not be empty");
			}

			CompanyImpl company = new CompanyImpl();
			company.name = this.name;
			company.ceo = this.ceo;
			company.cfo = this.cfo;
			company.cto = this.cto;
			company.departments.addAll(this.departments);
			return company;
		}

	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public List<Department> departments() {
		return List.copyOf(this.departments);
	}

	@Override
	public Employee ceo() {
		return this.ceo;
	}

	@Override
	public Employee cto() {
		return this.cto;
	}

	@Override
	public Employee cfo() {
		return this.cfo;
	}
	@Override
	public String toString() {
		return "CompanyImpl [name=" + name + ", departments=" + departments + ", ceo=" + ceo + ", cfo=" + cfo + ", cto="
				+ cto + "]";
	}


}
