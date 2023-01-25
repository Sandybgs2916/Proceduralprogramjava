package MyPackage;

public class palindrome {

	public static void main(String[] args) {
		int n = 454;
		int sum = 0;
		int temp = n;
		while(n > 0) {
			int r = n % 10;
			sum = (sum*10) + r;
			n = n/10;
		}
		if(sum == temp) {
			System.out.println(temp + " is a " + "palindrome number:");
		}
		else {
			System.out.println(temp + " is not a " + "palindrome number:");	
		}
	}
}