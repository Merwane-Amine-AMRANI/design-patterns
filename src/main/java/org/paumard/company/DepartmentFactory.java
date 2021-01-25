package org.paumard.company;

import java.util.List;

public abstract interface DepartmentFactory {
	
	Department createDepartement(String DepartementName, Employee head,List<Employee> managers, List<Project> projects);
}
