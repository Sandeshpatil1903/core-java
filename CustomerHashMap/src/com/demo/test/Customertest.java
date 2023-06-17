package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Product;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class Customertest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CustomerService cs=new CustomerServiceImpl();
	    int choice=0;
	    
	    do {
			System.out.println("\n1.Add Customer with orders \n2.Display all \n3.Search by customer name \n4.Search by id "
					+ "\n5.Sort by customer id \n6.Sort by customer name \n7. Modify product \n8.Delete Customer \n9.Exit\nChoice:");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				cs.addCustomer();
				break;
				
			case 2: 
				Map<Customer,List<Product>>clist=cs.displayAll();
				Set<Map.Entry<Customer,List<Product>>> s1=clist.entrySet();
				for(Map.Entry<Customer,List<Product>> entry:s1 ) {
					System.out.println(entry.getKey()+"----->"+entry.getValue());
					}
				break;
				
			case 3:
				System.out.println("Enter the customer name to be searched");
				String nm=sc.next();
				 clist=cs.displayByName(nm);
				 System.out.println(clist);
				break;
				
			case 4: 
				System.out.println("Enter the customer id to be searched");
				int id=sc.nextInt();
				clist=cs.displayById(id);
				System.out.println(clist);
				break;
				
			case 5:
				clist=cs.sortById();
			}
			
			
			
	    }while(choice!=9);
	}

}
