package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Product;

public interface Customerdao {

	void addCustomer(Customer c, List<Product> ilist);

	Map<Customer, List<Product>> getAll();

	Map<Customer, List<Product>> getById(int id);

	Map<Customer, List<Product>> getByName(String nm);

	Map<Customer, List<Product>> sortById();

}
