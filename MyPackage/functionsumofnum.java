package MyPackage;

public class functionsumofnum {
	public static int addNumbers(int a, int b) {
		int sum = a + b;
		System.out.println("Sum is : " + sum);
		return sum;
	}
	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 15;
		addNumbers(num1, num2);
	}
}