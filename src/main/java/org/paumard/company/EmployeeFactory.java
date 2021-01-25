package org.paumard.company;

public abstract interface EmployeeFactory {

		 Employee createEmployee(String name,int age,String employeeType);
}
