package com.team3.www;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class JacksonUse {
    public static void main(String[] args) {
        InputStream input = null;
        try {
            input = new FileInputStream("src/com/team3/www/employee.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();

        List<EmployeeDTO> employee = null;
        try {
            employee = objectMapper.readValue(input,
                    typeFactory.constructCollectionType(
                            ArrayList.class, EmployeeDTO.class));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Arrays.sort(employee.toArray());
        // System.out.print(employee);

        Collections.sort(employee, new Comparators(new LastNameComparator(),
		new PositionComparator(), new SalaryComparator()));
        
        System.out.println(employee.get(0).getLastName() + " " +
                employee.get(0).getPosition() + " " +
                employee.get(0).getSalary());
        System.out.println(employee.get(1).getLastName() + " " +
                employee.get(1).getPosition() + " " +
                employee.get(1).getSalary());
        System.out.println(employee.get(2).getLastName() + " " +
                employee.get(2).getPosition() + " " +
                employee.get(2).getSalary());
        System.out.println(employee.get(3).getLastName() + " " +
                employee.get(3).getPosition() + " " +
                employee.get(3).getSalary());
        System.out.println(employee.get(4).getLastName() + " " +
                employee.get(4).getPosition() + " " +
                employee.get(4).getSalary());
        System.out.println(employee.get(5).getLastName() + " "
		+ employee.get(5).getPosition() + " "
		+ employee.get(5).getSalary());
	System.out.println(employee.get(6).getLastName() + " "
		+ employee.get(6).getPosition() + " "
		+ employee.get(6).getSalary());
        System.out.println("------------------------");
    }
}
