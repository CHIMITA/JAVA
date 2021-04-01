package method3;

public class Main {

	static int myHP = 100;
	static int monsterHP = 1000;

	public static void main(String[] args) {

		int damage = 0;

		damage = attack(100, 1000);

		System.out.println("¾îÅÃÇÑ µ¥¹ÌÁö :" + damage);

	}

	private static int attack(int userHP, int mobHP) {
		int damage = 0;

		damage = mobHP - userHP;

		return damage;
	}
}
