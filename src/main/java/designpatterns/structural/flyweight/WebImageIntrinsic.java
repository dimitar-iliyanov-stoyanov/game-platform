package designpatterns.structural.flyweight;

class WebImageIntrinsic {

	private static int imagesCount = 0;

	public WebImageIntrinsic() {
		++imagesCount;
	}

	public void printImage(int x, int y) {
		System.out.println("Web Image #" + imagesCount + " printed on coordinates: " + x + " " + y);
	}

}