package MyPackage;

import java.util.Scanner;

public class primenumbet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i, j;
		for(i = a; i <= b; i++) {
			for(j = 2; j < i; j++) {
				if(i % j == 0) {
					break;
				}
			}
			if(j == i) {
				System.out.print(i + " ");
			}
		}
	}
}