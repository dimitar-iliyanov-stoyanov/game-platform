package designpatterns.creational.simplefactory.impl;

import designpatterns.creational.simplefactory.Knight;

class DragonKnight implements Knight {

	@Override
	public void fight() {
		System.out.println("Dragon Knight");
	}

}