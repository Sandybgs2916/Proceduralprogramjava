package MyPackage;

public class swapoftwonum {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		 System.out.println("before swap");
		 System.out.println("X is :" +x);
		 System.out.println("Y is :" +y);
		x = x + y;
		y = x - y;
		x = x - y;
		 System.out.println("After swap");
		 System.out.println("X is :" +x);
		 System.out.println("Y is :" +y);
	}
}