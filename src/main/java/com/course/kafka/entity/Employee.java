package com.course.kafka.entity;

import java.time.LocalDate;

public class Employee {
private String employeeId;
private String name;
//private LocalDate birthDate;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String employeeId, String name) {
	super();
	this.employeeId = employeeId;
	this.name = name;
}
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
}
}
