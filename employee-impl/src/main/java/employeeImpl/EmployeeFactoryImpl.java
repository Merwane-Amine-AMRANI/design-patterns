package employeeImpl;

import java.util.Objects;

import org.paumard.company.Employee;
import org.paumard.company.EmployeeFactory;

import EmployeeType.Ceo;
import EmployeeType.Cfo;
import EmployeeType.Contractor;
import EmployeeType.Cto;
import EmployeeType.DepartmentManager;
import EmployeeType.Developper;
import EmployeeType.FullTime;
import EmployeeType.PartTime;
import EmployeeType.ProjectManager;

public class EmployeeFactoryImpl implements EmployeeFactory {

	@Override
	public Employee createEmployee(String name, int age, String employeeType) {

		if (Objects.equals(employeeType.toLowerCase(), "ceo")) {
			Ceo ceo = Ceo.getInstance();
			ceo.setAge(age);
			ceo.setName(name);
			return ceo;
		} else if (Objects.equals(employeeType.toLowerCase(), "cfo")) {
			Cfo cfo = Cfo.getInstance();
			cfo.setAge(age);
			cfo.setName(name);
			return cfo;
		} else if (Objects.equals(employeeType.toLowerCase(), "cto")) {
			Cto cto = Cto.getInstance();
			cto.setAge(age);
			cto.setName(name);
			return cto;
		} else if (Objects.equals(employeeType.toLowerCase(), "departmentmanager")) {
			DepartmentManager instance = new DepartmentManager();
			instance.setAge(age);
			instance.setName(name);
			return instance;
		} else if (Objects.equals(employeeType.toLowerCase(), "developper")) {
			Developper instance = new Developper();
			instance.setAge(age);
			instance.setName(name);
			return instance;
		} else if (Objects.equals(employeeType.toLowerCase(), "fulltime")) {
			return new FullTime(name, age);
		} else if (Objects.equals(employeeType.toLowerCase(), "parttime")) {
			PartTime instance = new PartTime();
			instance.setAge(age);
			instance.setName(name);
			return instance;
		} else if (Objects.equals(employeeType.toLowerCase(), "projectmanager")) {
			ProjectManager instance = new ProjectManager();
			instance.setAge(age);
			instance.setName(name);
			return instance;
		} else if (Objects.equals(employeeType.toLowerCase(), "contractor")) {
			Contractor instance = new Contractor();
			instance.setAge(age);
			instance.setName(name);
			return instance;
		}

		return null;
	}

}
