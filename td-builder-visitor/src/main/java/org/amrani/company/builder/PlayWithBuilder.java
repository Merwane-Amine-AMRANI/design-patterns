package org.amrani.company.builder;

import org.amrani.company.Employee;
import org.amrani.company.Project;
import org.amrani.company.impl.EmployeeImpl;
import org.amrani.company.impl.ProjectImp;

public final class PlayWithBuilder {

	public static void main(String[] args) {
		
		EmployeeImpl.Builder employeeBuilder = EmployeeImpl.newBuilder();
		
		Employee ngolo = employeeBuilder.withName("NGolo")
						.withAge(32)
						.withSalary(2500)
						.Build();
		
		Employee paul = employeeBuilder.withName("paul")
				.withAge(30)
				.withSalary(2000)
				.Build();
		
		Employee kin = employeeBuilder.withName("kin")
				.withAge(31)
				.withSalary(2100)
				.Build();
		
	System.out.println(ngolo);
	
	ProjectImp.Builder projectBuilder = new ProjectImp.Builder();
	
	Project project = 
	projectBuilder.withName("TP Builder")
				   .withHead(ngolo)
				   .withWorkForceMember(paul)
				   .withWorkForceMember(kin)
				   .build();
	
	System.out.println(project);
	
	
	}

}
