
public class Calc {
	int firstNumber = 0;
	int secondNumber = 0;
	int result = 0;
	
	void sum(int num1, int num2) {
		firstNumber = num1;
		secondNumber = num2;
		result = firstNumber + secondNumber;
		
	}
	
	int minus(int num1, int num2) {
		firstNumber = num1;
		secondNumber = num2;
		result = firstNumber - secondNumber;
		
		return result;
		
	}
}
