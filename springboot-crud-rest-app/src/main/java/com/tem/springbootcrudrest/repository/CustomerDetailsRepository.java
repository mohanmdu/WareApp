package com.tem.springbootcrudrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tem.springbootcrudrest.model.CustomerDetails;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long>{
	
	@Query(value = "select customercode From CustomerDetails")
	public List<String> findCustomerDetailsByCustomerCode();

}
