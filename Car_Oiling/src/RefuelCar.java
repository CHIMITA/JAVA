
public class RefuelCar {

	int oilBox = 100;
	
	public int getOil() {
		if (oilBox > 10) { //������ 10���� ���� ���
			oilBox -= 10;
			return 10;
		}else {
			return 0;
		}
	}

}
