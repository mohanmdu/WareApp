package com.tem.springbootcrudrest.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tem.springbootcrudrest.model.Customerpayment;
import com.tem.springbootcrudrest.model.VendorPaymentParent;
import com.tem.springbootcrudrest.model.Vendorpayment;
import com.tem.springbootcrudrest.service.CustomerPaymentService;
import com.tem.springbootcrudrest.service.VendorPaymentService;
import com.tem.util.UTCDateTime;

@RestController
@RequestMapping("/api/v1")
public class VendorPaymentCrudRestApi {

	@Autowired
	VendorPaymentService vendorPaymentService;

	@PostMapping("/createvendorpayment")
	public VendorPaymentParent createVendorPayment(@RequestBody VendorPaymentParent vendorPaymentParent) throws ParseException {

		Date datetime = UTCDateTime.getCurentTimeAndDate();

		vendorPaymentParent.setCreateddate(datetime);
		for(Vendorpayment vendor:vendorPaymentParent.getVendorpayment()) {
			vendor.setStatus("Pending");
		}

		VendorPaymentParent vendorPaymentParentresponse = vendorPaymentService.createVendorPayment(vendorPaymentParent);

		return vendorPaymentParentresponse;
	}

	@RequestMapping(path = "/vendorpaymentbystatusamount", method = RequestMethod.GET)
	public List<Vendorpayment> getVendorPaymentByStatusBalAmnt() {

		List<Vendorpayment> customerList = vendorPaymentService.getVendorPaymentByStatusBalAmount();

		return customerList;
	}

	@RequestMapping(path = "/vendorpaymentbystatus", method = RequestMethod.GET)
	public List<Vendorpayment> getVendorPaymentByStatus() {

		List<Vendorpayment> customerList = vendorPaymentService.getVendorPaymentByStatus();

		return customerList;
	}
	
	@PutMapping("/updatevendorpaymentchild")
	public List<Vendorpayment> updateVendorPaymentChild(@RequestBody List<Vendorpayment> vendorpaymentchild) {

		List<Vendorpayment> vendorPaymentchild = vendorPaymentService.updateVendorPaymentChild(vendorpaymentchild);
		

		return vendorPaymentchild;

	}
	
	@RequestMapping(path = "/vendorname/{name}", method = RequestMethod.GET)
	public List<Vendorpayment> getVendorListByName(@PathVariable(value = "name") String name) {

		List<Vendorpayment> vendorList = vendorPaymentService.getVendorListByName(name);

		return vendorList;
	}
	
	@RequestMapping(path = "/vendorchequelist", method = RequestMethod.GET)
	public List<Vendorpayment> getVendorChequeList() {

		List<Vendorpayment> customerList = vendorPaymentService.getVendorChequeList();

		return customerList;
	}
	
	//updateVendorCheque
	
	@PutMapping("/updatevendorchequelist")
	public List<Vendorpayment> updateVendorCheque(@RequestBody List<Vendorpayment> vendorpaymentchild) {

		List<Vendorpayment> vendorChequeList = vendorPaymentService.updateVendorCheque(vendorpaymentchild);
		

		return vendorChequeList;

	}
	
}
