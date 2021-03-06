package com.tem.springbootcrudrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tem.springbootcrudrest.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>{

	@Query(value = "SELECT vendorname FROM Vendor", nativeQuery = true)
	public List<String> getVendorListByNames();
	
	@Query(value = "select t From Vendor t where t.vendorname=:name")
	public List<Vendor> findVendorNames(@Param("name") String name);
	
	@Query(value = "select t From Vendor t where t.vendorname=:name")
	public List<Object> findVendorNameObject(@Param("name") String name);
	
	@Query(value = "select t From Vendor t where t.vendorname=:name")
	public Vendor findVendorNamesforCustPayService(@Param("name") String name);
	
	@Query(value = "select v.vendorname from vendor v inner join vehicle ve on v.id=ve.id where ve.vehicleno=:truckno",nativeQuery = true)
	public List<String> getVendorNameByTruckno(@Param("truckno") String truckno);
	
	/*@Query(value = "select v.vendorname, va.vendoraddr from vendor v inner join VendorAddress va on v.id=va.vehicleid where va.vehicleno=:truckno",nativeQuery = true)
	public List<String> getVendorNameAddressByTruckno(@Param("truckno") String truckno);*/
	
	@Query(value = "select v.vendorname,va.vendoraddr from vendor v inner join vendoraddress va on v.id=va.id inner join vehicle ve on v.id=ve.id  where ve.vehicleno=:truckno",nativeQuery = true)
	public List<Object> getVendorNameAddressByTruckno(@Param("truckno") String truckno);
	
}
