package com.java.cg.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.cg.retailstore.Cart;
import com.java.cg.retailstore.Customer;
import com.java.cg.retailstore.CustomerType;

public class TestRetailStore {
	
	/**
	 * Customer is an EMPLOYEE of store , he will get 30% discount on bill
	 * 
	 */
	@Test
	public void testCase1(){
		Customer customer = new Customer("C1", "Name1", CustomerType.EMPLOYEE, "11-11-2012");
				
		Cart cart = new Cart(customer, 100.0);
		assertEquals(Double.valueOf(70.0), cart.getPaybleAmount());
	}
	
	@Test
	public void testCase2(){
		Customer customer = new Customer("C2", "Name2", CustomerType.AFFALIATED, "11-11-2012");
				
		Cart cart = new Cart(customer, 150.0);
		assertEquals(Double.valueOf(140.0), cart.getPaybleAmount());
	}
	
	@Test
	public void testCase3(){
		Customer customer = new Customer("C3", "Name3", CustomerType.OTHER, "11-11-2012");
				
		Cart cart = new Cart(customer, 201.0);
		assertEquals(Double.valueOf(191.0), cart.getPaybleAmount());
	}
	
	@Test
	public void testCase4(){
		Customer customer = new Customer("C4", "Name4", CustomerType.OTHER, "11-11-2017");
				
		Cart cart = new Cart(customer, 99.0);
		assertEquals(Double.valueOf(99.0), cart.getPaybleAmount());
	}
	
	@Test
	public void testCase5(){
		Customer customer = new Customer("C5", "Name5", CustomerType.EMPLOYEE, "11-11-2017");
				
		Cart cart = new Cart(customer, 500.0);
		assertEquals(Double.valueOf(350.0), cart.getPaybleAmount());
	}
	
	@Test
	public void testCase6(){
		Customer customer = new Customer("C6", "Name6", CustomerType.AFFALIATED, "11-11-2017");
				
		Cart cart = new Cart(customer, 501.0);
		assertEquals(Double.valueOf(451.0), cart.getPaybleAmount());
	}

}
