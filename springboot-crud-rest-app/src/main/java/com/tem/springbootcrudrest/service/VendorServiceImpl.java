package com.tem.springbootcrudrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.tem.springbootcrudrest.model.Vendor;
import com.tem.springbootcrudrest.repository.VendorRepository;

@Component
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorRepository vendorRepository;

	@Override
	public Vendor createVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public String deleteById(long vendorId) {
		vendorRepository.deleteById(vendorId);
		return "Vendor Deleted Successfully";
	}

	@Override
	public List<Vendor> getVendorList() {
		return vendorRepository.findAll();
	}

	@Override
	public List<String> getVendorListByName() {
		
		return vendorRepository.getVendorListByNames();
	}

	@Override
	public List<String> findVendorByName(String name) {
		return vendorRepository.getVendorNameAddressByTruckno(name);
	}

	@Override
	public List<String> getVendorNameByTruckno(String truckno) {
		return vendorRepository.getVendorNameByTruckno(truckno);
	}

}
