package org.amrani.company;

import java.util.List;

public interface Company {

    String name();

    /**
     * @return the list of the departments of this company.
     */
    List<Department> departments();

    /**
     * @return the CEO of the company.
     */
    Employee ceo();

    /**
     * @return the CTO of the company.
     */
    Employee cto();

    /**
     * @return the CFO of the company.
     */
    Employee cfo();
}
