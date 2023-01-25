package MyPackage;

import java.util.Scanner;

public class ascii2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char ch = sc.next().trim().charAt(0);
		int value = ch;
		System.out.println("ASCII value of " +ch+ " is:" +value);
		// or type casting method
		System.out.println("ASCII value of " +ch+ " is:" +(int)ch);
	}
}