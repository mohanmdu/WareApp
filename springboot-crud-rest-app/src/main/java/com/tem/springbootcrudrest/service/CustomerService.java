package com.tem.springbootcrudrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tem.springbootcrudrest.model.Customer;
import com.tem.springbootcrudrest.model.CustomerDetails;
import com.tem.springbootcrudrest.model.Product;

@Service
public interface CustomerService {

	public Customer createCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public String deleteById(long customerId);

	public List<Customer> getCustomerList();
	
	public List<String> getCustomerListByName();
	
	public List<String> getListOfCustomerCode();
	
	public List<String> findCustomerByName(String name);
	
	public List<Object> getListOfCombineName();
	
	public String findCustomerNameByCustomercode(String customercode);
}
