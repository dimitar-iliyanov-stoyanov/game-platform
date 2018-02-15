package designpatterns.creational.builder;

public class Knight {

	private int damage;

	private Knight(int damage) {
		this.damage = damage;
	}

	public void doStuff() {
		System.out.println("Knight + " + damage);
	}

	public static class KnightBuilder {

		private int damage;

		public KnightBuilder setDamage(int damage) {
			this.damage = damage;
			return this;
		}

		public Knight build() {
			return new Knight(damage);
		}

	}

}