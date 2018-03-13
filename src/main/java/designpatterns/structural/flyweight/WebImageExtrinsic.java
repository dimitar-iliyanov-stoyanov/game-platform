package designpatterns.structural.flyweight;

public class WebImageExtrinsic {

	private WebImageIntrinsic webImage;
	private int x;
	private int y;

	public WebImageExtrinsic(int x, int y) {
		webImage = FlyweightFactory.createFlyweight();
		this.x = x;
		this.y = y;
	}

	public void printImage() {
		webImage.printImage(x, y);
	}

}