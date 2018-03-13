package designpatterns.behaviour.strategy;

public class Customer {

	private BillingStrategy billingStrategy;

	public Customer(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}

	private double getCartValue() {
		return 100.0d;
	}

	public double getCartFinalPrice() {
		return billingStrategy.getPrice(getCartValue());
	}

}