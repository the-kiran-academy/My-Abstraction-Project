package com.tka.abstract_class;

public abstract class PaymentProcessor {
	int a=10;
	public void logTransaction() {
		System.out.println(" log written ...");
	}
	
	public abstract boolean  processPayment(double amount);
	public abstract boolean validatePaymentDetails();
	public abstract boolean initiateTransaction();
	
	public PaymentProcessor() {
		
	}

}
