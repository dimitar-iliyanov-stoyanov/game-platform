package tests.designpatterns.behavioural.memento;

import org.junit.Test;

import designpatterns.behaviour.memento.PlayableCharacter;
import designpatterns.behaviour.memento.PlayableCharacter.Memento;

public class Client {

	@Test
	public void testMemento() {
		PlayableCharacter mario = new PlayableCharacter(2, "Mario", 3);
		Memento save1 = mario.save();
		System.out.println(mario);
		PlayableCharacter luigi = new PlayableCharacter(3, "Luigi", 1);
		System.out.println(luigi);
		luigi.load(save1);
		System.out.println(luigi);
	}

}