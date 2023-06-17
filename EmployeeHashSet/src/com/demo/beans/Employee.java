package com.demo.beans;

public class Employee implements Comparable {
	
	private int empid;
	private String ename,post;
	private double sal;
	
	
	
	
	public Employee() {
	      
	}
	
	public Employee(int empid, String ename, String post, double sal) {
		
		this.empid = empid;
		this.ename = ename;
		this.post = post;
		this.sal = sal;
	}
	public Employee(int empid) {
		
		this.empid = empid;
		this.ename = null;
		this.post = null;
		this.sal = 0;
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", post=" + post + ", sal=" + sal + "]";
	}
	
	
	public int hashCode() {
		System.out.println("Inside the hashcode "+this.empid);
		return empid;
	}
	
	public boolean equals(Object ob) {
		System.out.println("Inside the equals method");
		return empid==((Employee)ob).empid;
	}

	@Override
	public int compareTo(Object o) {
		return (int) (this.getSal()-((Employee)o).getSal());
	}


	
	

}
