package com.tka.interface_ex;

public class CreditCardPaymentProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		// process payment code
		System.out.println("process payment via credit card with amount "+ amount);
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {
		
		//payment detail validation code
		System.out.println("payment detail validated ..");
		return true;
	}

	@Override
	public boolean initiateTransaction() {
		// transaction initiate code
		System.out.println("transaction initiated..");
		return true;
	}

	

}
