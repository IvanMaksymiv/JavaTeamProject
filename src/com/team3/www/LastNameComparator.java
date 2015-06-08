package com.team3.www;

import java.util.Comparator;

public class LastNameComparator implements Comparator<EmployeeDTO> {

    @Override
    public int compare(EmployeeDTO emp1, EmployeeDTO emp2) {
	return emp1.getLastName().compareTo(emp2.getLastName());
    }
}