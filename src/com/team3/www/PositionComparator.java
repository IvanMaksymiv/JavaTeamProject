package com.team3.www;

import java.util.Comparator;

public class PositionComparator implements Comparator<EmployeeDTO> {

    @Override
    public int compare(EmployeeDTO emp1, EmployeeDTO emp2) {
	return emp1.getPosition().compareTo(emp2.getPosition());
    }
}