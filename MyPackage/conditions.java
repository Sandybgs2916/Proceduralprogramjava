package MyPackage;

import java.util.Scanner;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 if(x%2==0) {
			 System.out.println("Even");
		 }
		 else {
			 System.out.println("Odd");
		 }
	}
}