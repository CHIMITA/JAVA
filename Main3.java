
public class Main3 {

	public static void main(String[] args) {
		
		Calc myCalc = new Calc();
		myCalc.sum(400,500);
		
		System.out.println(myCalc.result);
		
		myCalc.minus(500,100);
		System.out.println(myCalc.result);
		
		int mainResult = myCalc.minus(500,100);
		System.out.println(mainResult);

	}
}
