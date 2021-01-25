package org.paumard.company;

import java.util.List;

public interface CompanyFactory {
	
	Company createCompany(String name, List<Department> departments, Employee cto, Employee cfo, Employee ceo);
}
