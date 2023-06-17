package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Product;

public interface CustomerService {

	void addCustomer();

	Map<Customer, List<Product>> displayAll();

	Map<Customer, List<Product>> displayById(int id);


	Map<Customer, List<Product>> displayByName(String nm);

	Map<Customer, List<Product>> sortById();

}
