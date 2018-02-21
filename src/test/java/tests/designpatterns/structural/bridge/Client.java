package tests.designpatterns.structural.bridge;

import org.junit.Test;

import designpatterns.structural.bridge.FemaleCharacter;
import designpatterns.structural.bridge.FootmanKnight;
import designpatterns.structural.bridge.Knight;
import designpatterns.structural.bridge.MaleCharacter;
import designpatterns.structural.bridge.MountedKnight;

public class Client {

	@Test
	public void testBridge() {
		FemaleCharacter jonahDark = new FemaleCharacter();
		Knight knightedJonah = new MountedKnight(jonahDark);
		System.out.println(knightedJonah.toString());

		MaleCharacter arthur = new MaleCharacter();
		Knight knightedArthur = new FootmanKnight(arthur);
		System.out.println(knightedArthur.toString());
	}

}