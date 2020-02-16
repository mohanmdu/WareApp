package com.tem.springbootcrudrest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "customerpayment")
@EntityListeners(AuditingEntityListener.class)
public class Customerpayment implements Serializable {

	private static final long serialVersionUID = 441523520593693263L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "childcustomerpaymentid")
	private long childcustomerpaymentid;

	@Column(name = "paymenttype")
	private String paymenttype;

	@Column(name = "amount")
	private double amount;

	@Column(name = "instrumentno")
	private String instrumentno;

	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "instrumentdate")
	private Date instrumentdate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "balanceamount")
	private double balanceamount;
	
	@Column(name = "customername")
	private String customername; 

	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cuspaymentid")
	private CustomerPaymentParent customerPaymentParent;

	public long getChildcustomerpaymentid() {
		return childcustomerpaymentid;
	}

	public void setChildcustomerpaymentid(long childcustomerpaymentid) {
		this.childcustomerpaymentid = childcustomerpaymentid;
	}

	public String getPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getInstrumentno() {
		return instrumentno;
	}

	public void setInstrumentno(String instrumentno) {
		this.instrumentno = instrumentno;
	}

	public Date getInstrumentdate() {
		return instrumentdate;
	}

	public void setInstrumentdate(Date instrumentdate) {
		this.instrumentdate = instrumentdate;
	}

	public CustomerPaymentParent getCustomerPaymentParent() {
		return customerPaymentParent;
	}

	public void setCustomerPaymentParent(CustomerPaymentParent customerPaymentParent) {
		this.customerPaymentParent = customerPaymentParent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount(double balanceamount) {
		this.balanceamount = balanceamount;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
}
