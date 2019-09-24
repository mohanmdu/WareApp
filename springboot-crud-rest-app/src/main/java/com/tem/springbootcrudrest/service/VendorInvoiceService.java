package com.tem.springbootcrudrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tem.springbootcrudrest.model.VendorInvoice;

@Service
public interface VendorInvoiceService {

	public VendorInvoice createVendorInvoice(VendorInvoice vendorInvoice);

	public String updateVendorInvoice(long vindorinvoiceid);

	public String deleteById(long vendorId);

	public List<VendorInvoice> getVendorInvoiceList();
}