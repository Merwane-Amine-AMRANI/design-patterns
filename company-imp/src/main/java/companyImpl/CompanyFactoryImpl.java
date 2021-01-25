package companyImpl;

import java.util.List;

import org.paumard.company.Company;
import org.paumard.company.CompanyFactory;
import org.paumard.company.Department;
import org.paumard.company.Employee;

public class CompanyFactoryImpl implements CompanyFactory {

	@Override
	public Company createCompany(String name, List<Department> departments, Employee cto, Employee cfo, Employee ceo) {
		CompanyImpl.Builder builder = new CompanyImpl.Builder();
		departments.forEach(d -> builder.withDepartments(d));
		Company company = builder.withCeo(ceo)
									.withCfo(cfo)
									.withCto(cto)
									.withName(name)
									.build();
		return company;
	}

	
}
