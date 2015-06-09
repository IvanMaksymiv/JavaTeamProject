package com.team3.www;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class EmployeeDTO {
    private String lastName;
    private String position;
    private int salary;

    @JsonCreator
    public EmployeeDTO(@JsonProperty("lastName") String lastName,
                       @JsonProperty("position") String position,
                       @JsonProperty("salary") int salary) {
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[lastName=" + this.lastName + ", position=" + this.position + ", salary="
                + this.salary + "]";
    }
}





