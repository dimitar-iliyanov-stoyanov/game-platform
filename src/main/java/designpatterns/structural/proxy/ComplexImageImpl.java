package designpatterns.structural.proxy;

public class ComplexImageImpl implements ComplexImage {

	public ComplexImageImpl() {
		System.out.println("Complex image created.");
	}

	@Override
	public void flyingColors() {
		System.out.println("Complex Image flying colors");
	}

}