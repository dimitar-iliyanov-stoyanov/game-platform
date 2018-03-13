package designpatterns.behaviour.memento;

public class PlayableCharacter {

	private int level;
	private String characterName;
	private int livesLeft;

	public PlayableCharacter(int level, String characterName, int livesLeft) {
		this.level = level;
		this.characterName = characterName;
		this.livesLeft = livesLeft;
	}

	public Memento save() {
		return new Memento(level, characterName, livesLeft);
	}

	public void load(Memento memento) {
		level = memento.getLevel();
		characterName = memento.getName();
		livesLeft = memento.getVersion();
	}

	public static class Memento {

		private int level;
		private String characterName;
		private int livesLeft;

		public Memento(int id, String name, int version) {
			this.level = id;
			this.characterName = name;
			this.livesLeft = version;
		}

		public int getLevel() {
			return level;
		}

		public String getName() {
			return characterName;
		}

		public int getVersion() {
			return livesLeft;
		}

	}

	@Override
	public String toString() {
		return level + " " + characterName + " " + livesLeft;
	}

}