package com.demo.service;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addEmployee();

	Set<Employee> displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	Set<Employee> sortBySal();

	Set<Employee> sortByName();

	boolean modifyBySal(int id, double sal);

	boolean deleteById(int id);
	
	
}
