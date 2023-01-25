package MyPackage;

public class functionswapnum {
	public static void swapNumbers(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
		return;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
        swapNumbers(a,b);
	}
}