package MyPackage;

import java.util.Scanner;

public class compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the time: ");
		double time = sc.nextDouble();
		double amount = principal*(Math.pow((1+(rate/100)),time));
		double interest = amount - principal;
		System.out.println("Amount are : " + amount);
		System.out.println("Compound Interest are : " + interest);
	}
}