package designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

class FlyweightFactory {

	private static List<WebImageIntrinsic> cache = new ArrayList<>();

	public static WebImageIntrinsic createFlyweight() {
		if (cache.isEmpty()) {
			WebImageIntrinsic webImage = new WebImageIntrinsic();
			cache.add(webImage);
		}

		return cache.get(0);
	}

}