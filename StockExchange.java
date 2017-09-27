package com.cts.banking.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="TestStockExchange")
public class StockExchange {
@Id
@GenericGenerator(name = "stock_id", strategy = "com.cts.banking.entities.IdGenerator")

 @GeneratedValue(generator = "stock_id")

//@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
@SequenceGenerator(name="orc_seq",sequenceName="")*/

@Column(name="Stock_Code")
private String code;
@Column(name="Name",nullable=false,length=100)
private String name;
@Column(name="Country",nullable=false,length=50)
private String country;
@Temporal(TemporalType.DATE)
@Column(name="ESTD")
private Date estd;
@Column(name="email")
private String email;
@Column(name="Rating")
private int rating;
@Column(name="ROI", columnDefinition="int default 67")
/*@Column(name="ROI", columnDefinition="varchar(55 default 'rgfjgrf'")*/
private int roi;
public int getRoi() {
	return roi;
}
public void setRoi(int roi) {
	this.roi = roi;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Date getEstd() {
	return estd;
}
public void setEstd(Date estd) {
	this.estd = estd;
}
	
}
