package companyImpl;

import org.paumard.company.Employee;
import org.paumard.company.Project;

import employeeImpl.EmployeeImplement;
import projectType.HRProject;

public class CompanyMain {

	public static void main(String[] args) {

		EmployeeImplement.Builder employeeBuilder = EmployeeImplement.newBuilder();

		Employee sarah = employeeBuilder.withName("Sarah")
										.withAge(23)
										.build();

		Employee james = employeeBuilder.withName("James")
										.withAge(24)
										.build();

		Employee jennifer = employeeBuilder.withName("Jennifer")
											.withAge(25).
											build();

		Employee chris = employeeBuilder.withName("Chris")
										.withAge(26)
										.build();


		HRProject.Builder builder = new HRProject.Builder();
		Project projectHR = builder.withHead(sarah)
								   .withWorkForce(james)
								   .withWorkForce(jennifer)
								   .withWorkForce(chris)
								   .build();
		
		System.out.println("Project :" + projectHR);

	}
}
