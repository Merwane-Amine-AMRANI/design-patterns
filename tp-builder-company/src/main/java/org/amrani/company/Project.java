package org.amrani.company;

import java.util.List;

public interface Project {

    String name();

    /**
     * @return the head of the project.
     */
    Employee head();

    /**
     * @return the list of the employees working on this project.
     */
    List<Employee> workForce();
}
