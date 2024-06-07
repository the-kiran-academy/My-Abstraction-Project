package com.tka.main;

import com.tka.abstract_class.CreditCardPaymentProcessor;
import com.tka.abstract_class.PaymentProcessor;

public class TestAbstractClass {

	public static void main(String[] args) {
		PaymentProcessor processor=new CreditCardPaymentProcessor();
		
		processor.processPayment(4000);
		processor.validatePaymentDetails();
		processor.initiateTransaction();
		

}
}
