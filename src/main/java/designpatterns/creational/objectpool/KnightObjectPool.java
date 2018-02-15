package designpatterns.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class KnightObjectPool {

	private List<Knight> availableObjets = new ArrayList<>();
	private List<Knight> objectsInUse = new ArrayList<>();

	public Knight getObject() {
		Knight knight = (availableObjets.size() > 0) ? availableObjets.remove(0) : new DragonKnight();
		objectsInUse.add(knight);

		return knight;
	}

	public void releaseObject(Knight knight) {
		if (objectsInUse.contains(knight)) {
			objectsInUse.remove(knight);
			availableObjets.add(knight);
		}
	}

	public void printCurrentState() {
		System.out.println("Available Objects: " + availableObjets.size());
		System.out.println("Objects In Use: " + objectsInUse.size());
	}

}