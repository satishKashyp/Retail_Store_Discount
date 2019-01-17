package com.java.cg.retailstore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Comp
 *
 */
public class Cart {
	
	private Customer customer;
	
	private Double billAmount;
	
	
	public Cart(Customer customer, Double billAmount) {		
		this.customer = customer;
		this.billAmount = billAmount;
	}

	
	  /**
	 * @return Double paybleAmount
	 */
	public Double getPaybleAmount() {
	      return calculatePrice();
	   }
	   
	   /**
	    * This method calculate the payble amount to take the bill amount and employee type
	 * @return price
	 */
	private Double calculatePrice(){
		   int percentage=0;
			switch(customer.getType()){
			case EMPLOYEE:
				percentage=30;
				break;
				
			case AFFALIATED:
				percentage=10;
				break;
			case OTHER:
				
				int periodOfTime=getYears(customer.getFirstVisitDate());
				  if(periodOfTime>2){
				percentage=5;
				}else{
				  percentage=0;
				}
				break;
				
			}
			return calAmount(billAmount, percentage);
	   }
	   
	   
	   private static Double calAmount(Double amount, int precentage){
			return amount-Math.floor(amount/100)*precentage;
		}
		
		/**This method get the first visit date of the customer and return 
		 * number of years
		 * @param startDate
		 * @return number of years
		 */
		private int getYears(String startDate){
			int period=0;
			try {
				period = getYearsBetweenDates(startDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return period;

			
		}
		
		
		/**
		 * @param firstVisitDate
		 * @return
		 * @throws ParseException
		 */
		public static int getYearsBetweenDates(String firstVisitDate) throws ParseException {
	        Calendar firstCal = GregorianCalendar.getInstance();
	        Calendar secondCal = GregorianCalendar.getInstance();

	        firstCal.setTime(new SimpleDateFormat("dd-MM-YYYY").parse(firstVisitDate));
	        secondCal.setTime(new Date());

	        secondCal.add(Calendar.DAY_OF_YEAR, 1 - firstCal.get(Calendar.DAY_OF_YEAR));

	        return secondCal.get(Calendar.YEAR) - firstCal.get(Calendar.YEAR);
	    }
		

	   

}
