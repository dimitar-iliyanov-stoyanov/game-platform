package tests.designpatterns.creational.objectpool;

import org.junit.Test;

import designpatterns.creational.objectpool.Knight;
import designpatterns.creational.objectpool.KnightObjectPool;

public class Client {

	@Test
	public void testObjectPool() {
		KnightObjectPool objectPool = new KnightObjectPool();
		Knight knight1 = objectPool.getObject();
		knight1.fight();
		objectPool.printCurrentState();

		Knight knight2 = objectPool.getObject();
		knight2.fight();
		objectPool.printCurrentState();

		objectPool.releaseObject(knight1);
		objectPool.printCurrentState();

		objectPool.releaseObject(knight2);
		objectPool.printCurrentState();
	}

}