package com.team3.www;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparators implements Comparator<EmployeeDTO> {

    private List<Comparator<EmployeeDTO>> listComparators;

    public Comparators(Comparator<EmployeeDTO>... comparators) {
	this.listComparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(EmployeeDTO emp1, EmployeeDTO emp2) {
	for (Comparator<EmployeeDTO> comparator : listComparators) {
	    int result = comparator.compare(emp1, emp2);
	    if (result != 0) {
		return result;
	    }
	}
	return 0;
    }
}