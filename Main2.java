package method2;

public class Main2 {

	static int powerGage = 3;

	public static void main(String[] args) {
		int userCommand = 1;

		if (powerGage > 1) {
			attack(powerGage);
		} else {
			attack();
		}
		if (powerGage > 1) {
			attack(powerGage);
		} else {
			attack();
		}
		if (powerGage > 1) {
			attack(powerGage);
		} else {
			attack();
		}
		if (powerGage > 1) {
			attack(powerGage);
		} else {
			attack();
		}
		if (powerGage > 1) {
			attack(powerGage);
		} else {
			attack();
		}
		if (powerGage > 1) {
			attack(powerGage);
		} else {
			attack();
		}

	}

	 private static void attack(int powerGage2) {
		 --powerGage;
		 System.out.println("SuperAvo");
		 System.out.println("PowerGage :" + powerGage);
	}

	static void attack() {
		System.out.println("Avo");
	}
}