package MyPackage;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		/* Q1: Print numbers from 1 to 5 using for loops
		for(int num = 1; num <= 5; num++) {
			System.out.println(num); 
			} */
		/* Q2: Print numbers from 1 to 5 using while loops 
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++; 
		} */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print(i + " ");
		}
	}
}