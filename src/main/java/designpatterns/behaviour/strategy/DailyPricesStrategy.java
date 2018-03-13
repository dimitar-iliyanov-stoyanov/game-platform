package designpatterns.behaviour.strategy;

public class DailyPricesStrategy implements BillingStrategy {

	@Override
	public double getPrice(double rawCost) {
		return rawCost;
	}

}