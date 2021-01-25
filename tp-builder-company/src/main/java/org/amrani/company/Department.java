package org.amrani.company;

import java.util.List;

public interface Department {

    /**
     * @return the head of the department.
     */
    Employee head();

    /**
     * @return the list of the managers of this department.
     */
    List<Employee> managers();

    /**
     * @return the list of the projects for this company.
     */
    List<Project> projects();
}
