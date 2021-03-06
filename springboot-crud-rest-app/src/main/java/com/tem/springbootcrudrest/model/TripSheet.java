package com.tem.springbootcrudrest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name = "tripsheet")
@EntityListeners(AuditingEntityListener.class)
public class TripSheet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "tripid")
	private long tripid;

	@Column(name = "loadno")
	private String loadno;

	@Column(name="customerinvoiceno")
	private long customerinvoiceno;
	
	@Column(name="vendorinvoiceno")
	private long vendorinvoiceno;	
	
	@Column(name = "tripNo")
	private String tripNo;

	@Column(name = "origin")
	private String origin;

	@Column(name = "destination")
	private String destination;

	@Column(name = "invoiceno")
	private String invoiceno;

	//@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "datetime")
	private Date datetime;
	
	@Column(name = "time")
	private String time;	

	@Column(name = "truckType")
	private String truckType;

	@Column(name = "truckno")
	private String truckno;

	@Column(name = "driverName")
	private String driverName;

	@Column(name = "noOfCase")
	private String noOfCase;

	@Column(name = "OPKM")
	private String OPKM;

	@Column(name = "CLSKM")
	private String CLSKM;

	@Column(name = "diffKM")
	private String diffKM;

	@Column(name = "advance")
	private String advance;

	@Column(name = "perkmchargecustomer")
	private String perkmchargecustomer;

	@Column(name = "perkmchargevendor")
	private String perkmchargevendor;

	@Column(name = "profit")
	private String profit;

	@Column(name = "tollBill")
	private String tollBill;

	@Column(name = "policeBill")
	private String policeBill;

	@Column(name = "freightAmtCust")
	private String freightAmtCust;

	@Column(name = "freightAmtVen")
	private String freightAmtVen;
	
	@Column(name = "haltingCharge")
	private String haltingCharge;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "updatedatetime")
	private String updateDateTime;

	@Column(name = "status")
	private String status;

	@Column(name = "username")
	private String username;

	@Column(name = "lastupdate")
	private String lastupdate;

	@Column(name = "customerinvoicestatus")
	private String customerinvoicestatus;

	@Column(name = "vendorinvoicestatus")
	private String vendorinvoicestatus;

	@Column(name = "paymentreceivedornot")
	private String paymentreceivedornot;

	@Column(name = "discount")
	private String discount;
	
	@Column(name = "originlocationid")
	private String originlocationid;
	
	@Column(name = "destinationlocationid")
	private String destinationlocationid;
	
	@Column(name = "trailerequipmenttype")
	private String trailerequipmenttype;
	
	@Column(name = "customerrate")
	private String customerrate;
	
	@Column(name = "vendorrate")
	private String vendorrate;
	
	@Column(name = "customerperkm")
	private String customerperkm;
	
	@Column(name = "vendorperkm")
	private String vendorperkm;
	
	@Column(name = "customername")
	private String customername;
	
	@Column(name = "vendorname")
	private String vendorname;
	
	@Column(name = "gatein")
	private String gatein; 
		@Column(name = "gateout")
	private String gateout; 
	@Column(name = "haltedtime")
	private String haltedtime; 
	@Column(name = "customerhalt")
	private String customerhalt;
	@Column(name = "vendorhalt")
	private String vendorhalt;
	 
	public String getGatein() {
		return gatein;
	}

	public void setGatein(String gatein) {
		this.gatein = gatein;
	}

	public String getGateout() {
		return gateout;
	}

	public void setGateout(String gateout) {
		this.gateout = gateout;
	}

	public String getHaltedtime() {
		return haltedtime;
	}

	public void setHaltedtime(String haltedtime) {
		this.haltedtime = haltedtime;
	}

	public String getCustomerhalt() {
		return customerhalt;
	}

	public void setCustomerhalt(String customerhalt) {
		this.customerhalt = customerhalt;
	}

	public String getVendorhalt() {
		return vendorhalt;
	}

	public void setVendorhalt(String vendorhalt) {
		this.vendorhalt = vendorhalt;
	}


	
	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	
	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public long getTripid() {
		return tripid;
	}

	public void setTripid(long tripid) {
		this.tripid = tripid;
	}

	public long getCustomerinvoiceno() {
		return customerinvoiceno;
	}

	public void setCustomerinvoiceno(long customerinvoiceno) {
		this.customerinvoiceno = customerinvoiceno;
	}

	public long getVendorinvoiceno() {
		return vendorinvoiceno;
	}

	public void setVendorinvoiceno(long vendorinvoiceno) {
		this.vendorinvoiceno = vendorinvoiceno;
	}

	public String getLoadno() {
		return loadno;
	}

	public void setLoadno(String loadno) {
		this.loadno = loadno;
	}

	public String getFreightAmtCust() {
		return freightAmtCust;
	}

	public void setFreightAmtCust(String freightAmtCust) {
		this.freightAmtCust = freightAmtCust;
	}

	public String getFreightAmtVen() {
		return freightAmtVen;
	}

	public void setFreightAmtVen(String freightAmtVen) {
		this.freightAmtVen = freightAmtVen;
	}

	public String getTripNo() {
		return tripNo;
	}

	public void setTripNo(String tripNo) {
		this.tripNo = tripNo;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getTruckno() {
		return truckno;
	}

	public void setTruckno(String truckno) {
		this.truckno = truckno;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getNoOfCase() {
		return noOfCase;
	}

	public void setNoOfCase(String noOfCase) {
		this.noOfCase = noOfCase;
	}

	public String getOPKM() {
		return OPKM;
	}

	public void setOPKM(String OPKM) {
		this.OPKM = OPKM;
	}

	public String getCLSKM() {
		return CLSKM;
	}

	public void setCLSKM(String CLSKM) {
		this.CLSKM = CLSKM;
	}

	public String getDiffKM() {
		return diffKM;
	}

	public void setDiffKM(String diffKM) {
		this.diffKM = diffKM;
	}

	public String getAdvance() {
		return advance;
	}

	public void setAdvance(String advance) {
		this.advance = advance;
	}

	public String getPerkmchargecustomer() {
		return perkmchargecustomer;
	}

	public void setPerkmchargecustomer(String perkmchargecustomer) {
		this.perkmchargecustomer = perkmchargecustomer;
	}

	public String getPerkmchargevendor() {
		return perkmchargevendor;
	}

	public void setPerkmchargevendor(String perkmchargevendor) {
		this.perkmchargevendor = perkmchargevendor;
	}

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public String getTollBill() {
		return tollBill;
	}

	public void setTollBill(String tollBill) {
		this.tollBill = tollBill;
	}

	public String getPoliceBill() {
		return policeBill;
	}

	public void setPoliceBill(String policeBill) {
		this.policeBill = policeBill;
	}

	public String getHaltingCharge() {
		return haltingCharge;
	}

	public void setHaltingCharge(String haltingCharge) {
		this.haltingCharge = haltingCharge;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getCustomerinvoicestatus() {
		return customerinvoicestatus;
	}

	public void setCustomerinvoicestatus(String customerinvoicestatus) {
		this.customerinvoicestatus = customerinvoicestatus;
	}

	public String getVendorinvoicestatus() {
		return vendorinvoicestatus;
	}

	public void setVendorinvoicestatus(String vendorinvoicestatus) {
		this.vendorinvoicestatus = vendorinvoicestatus;
	}

	public String getPaymentreceivedornot() {
		return paymentreceivedornot;
	}

	public void setPaymentreceivedornot(String paymentreceivedornot) {
		this.paymentreceivedornot = paymentreceivedornot;
	}

	public String getOriginlocationid() {
		return originlocationid;
	}

	public void setOriginlocationid(String originlocationid) {
		this.originlocationid = originlocationid;
	}

	public String getDestinationlocationid() {
		return destinationlocationid;
	}

	public void setDestinationlocationid(String destinationlocationid) {
		this.destinationlocationid = destinationlocationid;
	}

	public String getTrailerequipmenttype() {
		return trailerequipmenttype;
	}

	public void setTrailerequipmenttype(String trailerequipmenttype) {
		this.trailerequipmenttype = trailerequipmenttype;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TripSheet) {
			return ((TripSheet) obj).loadno == loadno;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(this.loadno);
	}

	public String getCustomerrate() {
		return customerrate;
	}

	public void setCustomerrate(String customerrate) {
		this.customerrate = customerrate;
	}

	public String getVendorrate() {
		return vendorrate;
	}

	public void setVendorrate(String vendorrate) {
		this.vendorrate = vendorrate;
	}

	public String getCustomerperkm() {
		return customerperkm;
	}

	public void setCustomerperkm(String customerperkm) {
		this.customerperkm = customerperkm;
	}

	public String getVendorperkm() {
		return vendorperkm;
	}

	public void setVendorperkm(String vendorperkm) {
		this.vendorperkm = vendorperkm;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
