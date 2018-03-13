package designpatterns.structural.proxy;

public class ComplexImageProxy implements ComplexImage {

	ComplexImageImpl complexImage;

	@Override
	public void flyingColors() {
		if (complexImage == null) {
			complexImage = new ComplexImageImpl();
		}
		complexImage.flyingColors();
	}

}