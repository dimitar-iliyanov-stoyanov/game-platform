package tests.designpatterns.structural.proxy;

import org.junit.Test;

import designpatterns.structural.proxy.ComplexImage;
import designpatterns.structural.proxy.ComplexImageProxy;

public class Client {

	@Test
	public void testProxy() {
		ComplexImage image = new ComplexImageProxy(); // Image can be used without being initialized

		image.flyingColors(); // Now it is initialized
	}

}