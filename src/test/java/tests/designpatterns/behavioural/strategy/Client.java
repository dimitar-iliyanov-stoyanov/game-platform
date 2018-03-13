package tests.designpatterns.behavioural.strategy;

import org.junit.Test;

import designpatterns.behaviour.strategy.BillingStrategy;
import designpatterns.behaviour.strategy.Customer;
import designpatterns.behaviour.strategy.DailyPricesStrategy;
import designpatterns.behaviour.strategy.HappyHourStrategy;

public class Client {

	@Test
	public void testStrategy() {
		BillingStrategy friday = new DailyPricesStrategy();
		Customer john = new Customer(friday);
		System.out.println(john.getCartFinalPrice());

		BillingStrategy sunday = new HappyHourStrategy();
		Customer dimitar = new Customer(sunday);
		System.out.println(dimitar.getCartFinalPrice());
	}

}