package MyPackage;

import java.util.Scanner;

public class celsiustofah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temp in c:");
		float tempc = sc.nextFloat();
		float tempf = ((tempc*9)/5)+32;
		System.out.println(tempf);
	}
}