package designpatterns.behaviour.strategy;

public interface BillingStrategy {
	double getPrice(double rawCost);
}