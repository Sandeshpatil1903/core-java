package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Set<Employee> displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	Set<Employee> sortBySal();

	Set<Employee> sortByName();

	boolean modifyBySal(int id, double sal);

	boolean deleteById(int id);

}
