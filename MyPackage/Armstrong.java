package MyPackage;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int Originalnum = n;
		while(n>0) {
			int rem = n % 10;
			result += Math.pow(rem, 3);
			n = n/10;
		}
		if(result == Originalnum) {
			System.out.println("Armstrong Number");
		}
		else {
		System.out.println("Not an Armstrong Number");
    }
}
}