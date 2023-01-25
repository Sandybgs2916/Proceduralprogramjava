package MyPackage;

import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		boolean isprime = true;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				isprime = false;
				break;
			}
		}
		if(isprime) { // i.e if is prime is true 
			System.out.println(num + " is a prime number ");
		}
		else {
			System.out.println(num + " is not a prime number ");
		}		
		}
}			