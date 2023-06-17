package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.Customer;
import com.demo.beans.Product;

public class CustomerdaoImpl implements Customerdao {
	public static Map<Customer, List<Product>> cmap=new HashMap<>();
	static {
	   Customer c= new Customer(1,"Gaurav");
	   List<Product>plist=new ArrayList<>();
	   plist.add(new Product(1,"Lays","Weffers"));
	   plist.add(new Product(1,"Balaji","Weffers"));
	   cmap.put(c, plist);
	}

	@Override
	public void addCustomer(Customer c, List<Product> ilist) {
		cmap.put(c, ilist);
		}

	@Override
	public Map<Customer, List<Product>> getAll() {
		return cmap;
	}

	@Override
	public Map<Customer, List<Product>> getById(int id) {
		Set<Customer> cset=cmap.keySet();
		for(Customer c:cset) {
			System.out.println(c.getCustid());
			if(c.getCustid()==id) {
			 Map<Customer,List<Product>> clist=new HashMap<>();
			 clist.put(c,cmap.get(c));
			 System.out.println(clist);
			 return  clist;
			}
		}
		return null;
	}

	@Override
	public Map<Customer, List<Product>> getByName(String nm) {
		Map<Customer,List<Product>> ctemp=new HashMap<>();
         Set<Customer> cset=cmap.keySet();
         for(Customer key:cset) {
        	 if((key.getCname()).equals(nm)) {
        		 ctemp.put(key,cmap.get(key));
        	 }
         }
         
         return ctemp;
	}

	@Override
	public Map<Customer, List<Product>> sortById() {
		Comparator <Customer> c=(o1,o2)->{return o1.getCustid()-o2.getCustid();};
		
		Set<Map.Entry<Customer,List<Product>>> cl=cmap.entrySet();
		Map<Customer, List<Product>> tset=new TreeMap<>(c);
		for(Map.Entry<Customer, List<Product>> key:cl) {
			//tset.put(Customer, null);
		}
		
		return null;
	}

}
