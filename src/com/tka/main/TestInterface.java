package com.tka.main;

import com.tka.interface_ex.CreditCardPaymentProcessor;
import com.tka.interface_ex.PaymentProcessor;
import com.tka.interface_ex.PaypalPaymentProcessor;

public class TestInterface {

	public static void main(String[] args) {
		PaymentProcessor processor= new CreditCardPaymentProcessor();
		
		processor.processPayment(1000);
		processor.validatePaymentDetails();
		processor.initiateTransaction();
		
		System.out.println("**************");
		PaymentProcessor paypalProcessor=new PaypalPaymentProcessor();
		paypalProcessor.processPayment(2000);
		paypalProcessor.validatePaymentDetails();
		paypalProcessor.initiateTransaction();
		
		
		
		
		

	}

}
