package datastructures.dynamicarray;

public class DynamicArray {

	private static final int DEFAULT_CAPACITY_SIZE = 16;

	private int capacity;
	private int size;
	private int array[];

	public DynamicArray() {
		this(DEFAULT_CAPACITY_SIZE);
	}

	public DynamicArray(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
	}

	private void resize() {
		int newCapacity = capacity * 2;
		int newArray[] = new int[newCapacity];

		for (int i = 0; i < capacity; ++i) {
			newArray[i] = array[i];
		}

		capacity = newCapacity;
		array = newArray;
	}

	public void add(int value) {
		if (size == capacity) {
			resize();
		}
		array[size++] = value;
	}

	public void add(int value, int index) {
		if (size == capacity) {
			resize();
		}
		++size;
		for (int i = size - 1; i > index; --i) {
			array[i] = array[i - 1];
		}
		array[index] = value;
	}

	public int get(int index) {
		return array[index];
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void set(int value, int index) {
		if (index < capacity) {
			array[index] = value;
		}
	}

	public void remove(int index) {
		for (int i = index ; i < size - 1; ++i) {
			array[i] = array[i + 1];
		}
		--size;
	}

}