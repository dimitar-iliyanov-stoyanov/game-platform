package designpatterns.behaviour.iterator;

public interface WeaponIterator {
	Weapon getNext();
	boolean hasNext();
}