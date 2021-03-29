package method2;

public class Main {
	
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
		 System.out.println("½´ÆÛ¾ÆºÌ");
		 System.out.println("PowerGage :" + powerGage);
	}

	static void attack() {
		System.out.println("¾ÆºÌ");
	}
}
