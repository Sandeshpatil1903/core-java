package com.demo.beans;

public class Product {

	
	private int pid;
	private String pname;
	private String pcat;
	
	
	

	public Product() {
		super();
	}
	
	public Product(int pid, String pname, String pcat) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcat = pcat;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcat() {
		return pcat;
	}

	public void setPcat(String pcat) {
		this.pcat = pcat;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + "]";
	}

	
}
