package org.paumard.company;

import java.util.List;

public abstract interface ProjectFactory {
	
	Project creatProject(String projectType, String name, Employee headProject, List<Employee> workforces);

}
