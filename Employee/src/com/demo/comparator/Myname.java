package com.demo.comparator;

import java.util.Comparator;

import com.demo.beans.Employee;



public class Myname implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEname().compareTo(o2.getEname());
	}



}
