package com.tem.springbootcrudrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tem.springbootcrudrest.model.Customer;
import com.tem.springbootcrudrest.model.CustomerDetails;
import com.tem.springbootcrudrest.model.TripSheet;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
	@Query(value = "SELECT customername FROM Customer", nativeQuery = true)
	public List<String> getCustomersListByName();
	
	@Query(value = "Select c.customername as combinenames FROM Customer c UNION SELECT v.vendorname FROM Vendor v ORDER BY combinenames", nativeQuery = true)
	public List<String> getListOfCombineNames();
	
	
	
	@Query(value = "select t From Customer t where t.customername=:name")
	public List<Customer> findCustomerByNames(@Param("name") String name);
	
	@Query(value = "select customerAddr From CustomerDetails t where t.customercode=:customercode")
	public List<String> findCustomerByCustomerCode(@Param("customercode") String customercode);
	
	@Query(value = "select t From Customer t where t.customername=:name")
	public List<Object> findCustomerByNameObject(@Param("name") String name);
	
	@Query(value = "select t From Vendor t where t.vendorname=:name")
	public List<Object> findCustomerVendorNames(@Param("name") String name);
	
	@Query(value = "select COUNT(*) from Customer t where t.customername=:name")
	public int findCustomerNamesCount(@Param("name") String name);
	
	@Query(value = "select COUNT(*) from Vendor v where v.vendorname=:name")
	public int findVendorNamesCount(@Param("name") String name);
	
	@Query(value = "select t From Customer t where t.customername=:name")
	public Customer findCustomerByNamesforCustpaymentservice(@Param("name") String name);
	
	@Query(value="SELECT c.customername from customer c JOIN customer_details cd ON c.id = cd.id WHERE cd.customercode=:customercode",nativeQuery = true)
	public String findCustomerNameByCustomercode(@Param("customercode") String customercode);
	
}
