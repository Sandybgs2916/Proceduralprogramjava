package MyPackage;

import java.util.Scanner;

public class functionarmstrongnumbet2 {
		public static void findArmstrong(int a, int b) {
		for(int i =a; i<=b; i++) {
			int num = i;
			int sum = 0;
			while(num>0) {
				int rem = num % 10;
				sum += Math.pow(rem, 3);
				num = num / 10;
			}
			if(sum == i) {
				System.out.println("Armstrong numbers are:" + sum);
			}
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	findArmstrong(a, b);
}
}