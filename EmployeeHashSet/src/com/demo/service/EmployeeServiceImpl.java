package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeDao edao;
	Scanner sc=new Scanner(System.in);
	
	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}
	@Override
	public void addEmployee() {
		
		System.out.println("enter empid");
	    int empid=sc.nextInt();
	    System.out.println("enter ename");
	    String nm=sc.next();
	    System.out.println("enter desg");
	    String ds=sc.next();
	    System.out.println("enter Salary");
	    double s=sc.nextDouble();	
	    Employee e=new Employee(empid,nm,ds,s);
	    edao.save(e);
		
	}
	@Override
	public Set<Employee> displayAll() {

		return edao.displayAll();
		}
	@Override
	public Employee displayById(int id) {
		
		return edao.displayById(id);
	}
	@Override
	public Set<Employee> displayByName(String nm) {
		
		return edao.displayByName(nm);
	}
	@Override
	public Set<Employee> sortBySal() {
		
		return edao.sortBySal();
	}
	@Override
	public Set<Employee> sortByName() {
		
		return edao.sortByName();
	}
	@Override
	public boolean modifyBySal(int id, double sal) {
		
		return edao.modifyBySal(id,sal);
	}
	@Override
	public boolean deleteById(int id) {
		Employee ob=edao.displayById(id);
		if(ob!=null) {
			System.out.println("Do you really want to delete "+"Empid: "+ob.getEmpid()+" Name: "+ob.getEname()+
					"\n yes or no");
			String s=sc.next();
			
			if(s.equals("yes")) {
				return edao.deleteById(id);
			}
		}
				return false;
	}
		
	}


