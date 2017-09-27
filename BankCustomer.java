package com.cts.banking.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customerinfo")
public class BankCustomer {
    @EmbeddedId   
	private CustomerKey customerId;
    @Column(name="Name")
	private String customerName;
	public CustomerKey getCustomerId() {
		return customerId;
	}
	public void setCustomerId(CustomerKey customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
