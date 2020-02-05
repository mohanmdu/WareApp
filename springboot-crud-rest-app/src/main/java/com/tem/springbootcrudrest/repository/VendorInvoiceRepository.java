package com.tem.springbootcrudrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tem.springbootcrudrest.model.CustomerInvoice;
import com.tem.springbootcrudrest.model.VendorInvoice;

@Repository
public interface VendorInvoiceRepository extends JpaRepository<VendorInvoice, Long> {

	@Query(value = "select t From VendorInvoice t where t.vendorname=:vendorname and t.veninvoicedate between date(:fromdate) and date(:todate)")
	public List<VendorInvoice> findInvoiceBetweenDateList(@Param("fromdate") String fromdate,
			@Param("todate") String todate, @Param("vendorname") String vendorname);

	/*@Query(value = "select v From VendorInvoice v where v.vendorinvoiceid=:vendorinvoiceid",nativeQuery=true)
	public VendorInvoice findByVendorinvoiceid(@Param("vendorinvoiceid") long vendorinvoiceid);*/
	
	//public VendorInvoice findByvendorinvoiceid(long vendorinvoiceid);
	
	 @Query(value="SELECT v FROM VendorInvoice v WHERE v.vendorinvoiceid=:vendorinvoiceid") 
	 public VendorInvoice findByVendorInvoiceId(@Param("vendorinvoiceid") long vendorinvoiceid);
	 
	 @Query(value = "select v From VendorInvoice v where v.vendorname=:vendorname and v.paymentdate between date(:fromdate) and date(:todate)")
		public List<VendorInvoice> findInvoiceBetweenDateForLedgerForm(@Param("fromdate") String fromdate,
				@Param("todate") String todate,@Param("vendorname") String vendorname);
	 
	 

	/* @Query(value="SELECT t FROM TripSheet t WHERE t.loadno=:loadno") 
	 public TripSheet findByLoadNO(@Param("loadno") String loadno);*/
	 
	 //vendorinvoice datetimevendorname
	 
	 @Query(value = "select v From VendorInvoice v where  v.vendorname=:vendorname and v.paymentdate between date(:fromdate) and date(:todate)")
		public List<VendorInvoice> findVendorInvoiceByVenddatename(@Param("vendorname") String vendorname,@Param("fromdate") String fromdate,
				@Param("todate") String todate);
		
		@Query(value = "select v From VendorInvoice v where  v.paymentdate between date(:fromdate) and date(:todate)")
		public List<VendorInvoice> findVendInvoiceByFromDateToDate(@Param("fromdate") String fromdate,
				@Param("todate") String todate);
		
		
		@Query(value = "select v From VendorInvoice v where v.vendorname=:vendorname")
		public List<VendorInvoice> findCustInvoiceByVendorName(@Param("vendorname") String vendorname);
}
