package MyPackage;

import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i*i <= n; i++) {
		while(n % i == 0) {
			n = n/i;
		System.out.print(i + " ");
		}
	}
		if(n != 1) {  // prime number case
			System.out.println(n);
		}
	}
} 