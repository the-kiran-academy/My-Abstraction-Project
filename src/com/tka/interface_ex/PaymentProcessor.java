package com.tka.interface_ex;

public interface PaymentProcessor {
public final int a=10;

	public abstract boolean processPayment(double amount);

	public abstract boolean validatePaymentDetails();

	public abstract boolean initiateTransaction();
	
//	PaymentProcessor(){ Interfaces cannot have constructors
//		
//	}

}
