package tempprogramming;

class Knight {

	private static int damage = 20;

	static class NestedKnight {

		int damage = 30;

		static void accessTopClassDamage() {
			System.out.println(Knight.damage);
		}

	}

	void doSomethingTop() {
		
	}

}