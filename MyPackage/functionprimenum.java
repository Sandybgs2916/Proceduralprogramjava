package MyPackage;

import java.util.Scanner;

public class functionprimenum {
	public static void checkPrime(int num) {
		boolean isprime = true;
		if(num <= 1) {
			System.out.println("Invalid Number");
			return;
		}
		for(int i =2; i <= num/2; i++) {
			if(num % i == 0) {
				isprime = false;
				break;
			}
		}
		if(isprime) {
			System.out.println(num + " is a prime number ");
		}
		else {
			System.out.println(num + " is not a prime number ");
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		checkPrime(num);
	}
}