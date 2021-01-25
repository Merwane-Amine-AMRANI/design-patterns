package org.amrani.company.impl;

import java.util.ArrayList;
import java.util.List;


import org.amrani.company.Employee;
import org.amrani.company.Project;

public class ProjectImp implements Project {

	private String name;
	private Employee head;
	private List<Employee> workForce = new ArrayList<>();

	public static class Builder{

		private String name;
		private Employee head;
		private List <Employee> withWorkForceMember = new ArrayList<>();

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withHead(Employee head) {
				this.head=head;
			return this;
		}

		public Builder withWorkForceMember(Employee workForceMember) {
			this.withWorkForceMember .add(workForceMember);
			return this;
		}

		public Project build() {
			ProjectImp project = new ProjectImp();
			project.name = name;
			project.head = head;
			project.workForce.addAll(this.withWorkForceMember);
			return project;
		}
		
		
	}
	public String name() {
		return this.name;
	}

	public Employee head() {
		return head;
	}

	public List<Employee> workForce() {
		return List.copyOf(this.workForce);
		//return new ArrayList<>(this.workForce);
	}

	@Override
	public String toString() {
		return "ProjectImp [name=" + name + ", head=" + head + ", workForce=" + workForce + "]";
	}

}
