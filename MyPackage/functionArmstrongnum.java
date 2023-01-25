package MyPackage;

import java.util.Scanner;

public class functionArmstrongnum {
	public static void isArmstrong(int num) {
		int original = num;
		int result = 0;
		while(num > 0) {
			int rem = num % 10;
			result += Math.pow(rem,3);
			num = num / 10;
		}
			if(result == original) {
				System.out.println("Armstrong Number");
			}
			else {
				System.out.println("Not an Armstrong Number");
			}
			return;
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		isArmstrong(num);
	}
}