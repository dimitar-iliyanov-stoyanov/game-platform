package datastructures.dynamicarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Client {

	@Test
	public void testSizeAndCapacityAndAddToEnd() {
		DynamicArray array = new DynamicArray(1);
		for (int i = 0; i < 16; ++i) {
			array.add(i);
		}

		assertEquals(16, array.getSize());
		assertEquals(16, array.getCapacity());
		for (int i = 0; i < 16; ++i) {
			assertEquals(i, array.get(i));
		}
	}

	@Test
	public void testSet() {
		DynamicArray array = new DynamicArray(1);
		for (int i = 0; i < 16; ++i) {
			array.add(i);
		}
		array.set(10, 0);

		for (int i = 0; i < 16; ++i) {
			if (i == 0) {
				assertEquals(10, array.get(i));
			} else {
				assertEquals(i, array.get(i));
			}
		}
	}

	@Test
	public void testAddWithIndex() {
		DynamicArray array = new DynamicArray(1);
		for (int i = 0; i < 16; ++i) {
			array.add(i);
		}

		array.add(11, 0);
		for (int i = 0; i < 17; ++i) {
			if (i == 0) {
				assertEquals(11, array.get(i));
			} else {
				assertEquals(i - 1, array.get(i));
			}
		}
	}

	@Test
	public void testRemove() {
		DynamicArray array = new DynamicArray(1);
		for (int i = 0; i < 16; ++i) {
			array.add(i);
		}
		array.remove(0);

		for (int i = 0; i < 15; ++i) {
			assertEquals(i + 1, array.get(i));
		}
	}

}