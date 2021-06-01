import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Car_OilStation myCar = new Car_OilStation();

		/*
		 * myCar.startEngine(); myCar.oilState(); myCar.oil_check(); myCar.speedUP();
		 * myCar.speedUP(); myCar.speedUP(); myCar.oilState(); myCar.speedUP();
		 * myCar.speedUP(); myCar.oil_check(); myCar.endEngine(); myCar.none_oil();
		 * myCar.oiling(); myCar.oilState(); myCar.oil_check();
		 */

		Scanner scanner = new Scanner(System.in);
		String str;

		str = scanner.nextLine();

		switch (str) {
		case "시동걸기":
			myCar.startEngine();

			break;
		case "기름확인":

		default:
			break;
		}

	}
}
