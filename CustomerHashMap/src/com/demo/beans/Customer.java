package com.demo.beans;

public class Customer {
	
	private int custid;
	private String cname;
	
	


	public Customer() {
		super();
	}

	public Customer(int custid, String cname) {
		super();
		this.custid = custid;
		this.cname = cname;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", cname=" + cname + "]";
	}
	
	
}
