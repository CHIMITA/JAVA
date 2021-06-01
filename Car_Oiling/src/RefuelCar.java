
public class RefuelCar {

	int oilBox = 100;
	
	public int getOil() {
		if (oilBox > 10) { //오일이 10보다 많을 경우
			oilBox -= 10;
			return 10;
		}else {
			return 0;
		}
	}

}
