package departementImpl;

import java.util.List;
import java.util.Objects;

import org.paumard.company.Department;
import org.paumard.company.DepartmentFactory;
import org.paumard.company.Employee;
import org.paumard.company.Project;

import departementType.FinancialDepartment;
import departementType.HRDepartment;
import departementType.ITDepartment;

public class DepartementImpl implements DepartmentFactory {

	@Override
	public Department createDepartement(String DepartementName, Employee head, List<Employee> managers,
			List<Project> projects) {
		if (Objects.equals(DepartementName.toLowerCase(), "financialdepartment")) {
			FinancialDepartment.Builder builder = new FinancialDepartment.Builder();
			builder.withHead(head);
			managers.forEach(manager -> builder.withManagementMember(manager));
			projects.forEach(project -> builder.withProject(project));
			return builder.build();
		} else if (Objects.equals(DepartementName.toLowerCase(), "itdepartment")) {
			ITDepartment.Builder builder = new ITDepartment.Builder();
			builder.withHead(head);
			managers.forEach(manager -> builder.withListManagers(manager));
			projects.forEach(prpject -> builder.withProject(prpject));
			return builder.build();
		} else if (Objects.equals(DepartementName.toLowerCase(), "hrdepartment")) {
			HRDepartment.Builder builder = new HRDepartment.Builder();
			builder.withHead(head);
			managers.forEach(m -> builder.withManagementMember(m));
			projects.forEach(p -> builder.withProject(p));
			return builder.build();
		}
		return null;
	}

}
