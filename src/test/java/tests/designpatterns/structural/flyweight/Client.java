package tests.designpatterns.structural.flyweight;

import org.junit.Test;

import designpatterns.structural.flyweight.WebImageExtrinsic;

public class Client {

	@Test
	public void testFlyweight() {
		WebImageExtrinsic webImage1 = new WebImageExtrinsic(10, 200);
		webImage1.printImage();

		WebImageExtrinsic webImage2 = new WebImageExtrinsic(12, 204);
		webImage2.printImage();

		WebImageExtrinsic webImage3 = new WebImageExtrinsic(14, 300);
		webImage3.printImage();
	}

}