package designpatterns.behaviour.strategy;

public class HappyHourStrategy implements BillingStrategy {

	@Override
	public double getPrice(double rawCost) {
		return rawCost * 0.8;
	}

}