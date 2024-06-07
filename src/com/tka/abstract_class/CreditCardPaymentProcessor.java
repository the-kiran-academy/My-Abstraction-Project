package com.tka.abstract_class;

public class CreditCardPaymentProcessor extends PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		// process payment code
		System.out.println("process payment via credit card with amount " + amount);
		logTransaction();
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {

		// payment detail validation code
		System.out.println("payment detail validated ..");
		logTransaction();
		return true;
	}

	@Override
	public boolean initiateTransaction() {
		// transaction initiate code
		System.out.println("transaction initiated..");
		logTransaction();
		return true;
	}

}
