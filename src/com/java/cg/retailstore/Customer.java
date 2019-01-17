package com.java.cg.retailstore;

/**
 * @author Comp
 * This is customer class which hold the data related to particular customer eg, type and first visit date
 */
public class Customer {
	
	private String custId;
	private String name;
	private CustomerType type;
	private String firstVisitDate;
	
	public String getFirstVisitDate() {
		return firstVisitDate;
	}
	public void setFirstVisit(String firstVisitDate) {
		this.firstVisitDate = firstVisitDate;
	}
	public Customer(String custId, String name, CustomerType type, String firstVisitDate) {
		super();
		this.custId = custId;
		this.name = name;
		this.type = type;
		this.firstVisitDate = firstVisitDate;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	

}
