package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Product;
import com.demo.dao.Customerdao;
import com.demo.dao.CustomerdaoImpl;

public class CustomerServiceImpl implements CustomerService {
	public List<Product>ilist= new ArrayList<>();
     Customerdao cdao=new CustomerdaoImpl();
 
	@Override
	public void addCustomer() {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the customer id");
	    int cid=sc.nextInt();
	    System.out.println("Enter the customer name");
	    String cname=sc.next();
	    Customer c= new Customer(cid,cname);
	    int choice=0;
	    do {
	    	System.out.println("1.Add product \n2.Exit");
	    	choice=sc.nextInt();
	    	switch(choice) {
	    	case 1:
	    		System.out.println("Enter the product id");
	    		int pid= sc.nextInt();
	    		System.out.println("Enter the product name");
	    		String pname= sc.next();
	    		System.out.println("Enter the product category");
	    		String pcat=sc.next();
	    		Product p= new Product(pid,pname,pcat);
	    		ilist.add(p);
	    		break;
	    		
	    	case 2:
	    		System.out.println("Product added successfully!!!");
	    		break;
	    	}
	    }while(choice!=2);
	    
	       cdao.addCustomer(c,ilist);
	    	
	    
	}

	@Override
	public Map<Customer, List<Product>> displayAll() {
		return cdao.getAll();
		
	}

	@Override
	public Map<Customer, List<Product>> displayById(int id) {
		return cdao.getById(id);
	}

	@Override
	public Map<Customer, List<Product>> displayByName(String nm) {
		
		return cdao.getByName(nm);
	}

	@Override
	public Map<Customer, List<Product>> sortById() {
		
		return cdao.sortById();
	}

}
