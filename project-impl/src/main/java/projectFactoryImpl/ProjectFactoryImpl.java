package projectFactoryImpl;

import java.util.List;
import java.util.Objects;

import org.paumard.company.Employee;
import org.paumard.company.Project;
import org.paumard.company.ProjectFactory;

import projectType.BusinessProject;
import projectType.DBProject;
import projectType.FinanceProject;
import projectType.HRProject;
import projectType.WebProject;

public class ProjectFactoryImpl implements ProjectFactory {

	@Override
	public Project creatProject(String projectType, String name, Employee headProject, List<Employee> workforces) {
		if (Objects.equals(projectType.toLowerCase(), "businessproject")) {
			BusinessProject.Builder builder = new BusinessProject.Builder();
			builder.withHead(headProject).withName(name);
			workforces.forEach(member -> builder.withWorkForce(member));
			return builder.build();
		} else if (Objects.equals(projectType.toLowerCase(), "dbproject")) {
			DBProject.Builder builder = new DBProject.Builder();
			builder.withHead(headProject).withName(name);
			workforces.forEach(member -> builder.withWorkForce(member));
			return builder.build();
		} else if (Objects.equals(projectType.toLowerCase(), "financeproject")) {
			FinanceProject.Builder builder = new FinanceProject.Builder();
			builder.withHead(headProject).withName(name);
			workforces.forEach(member -> builder.withWorkForce(member));
			return builder.build();
		} else if (Objects.equals(projectType.toLowerCase(), "hrproject")) {
			HRProject.Builder builder = new HRProject.Builder();
			builder.withHead(headProject).withName(name);
			workforces.forEach(member -> builder.withWorkForce(member));
			return builder.build();
		} else if (Objects.equals(projectType.toLowerCase(), "webproject")) {
			WebProject.Builder builder = new WebProject.Builder();
			builder.withHead(headProject).withName(name);
			workforces.forEach(member -> builder.withWorkForce(member));
			return builder.build();
		}
		return null;
	}
}
