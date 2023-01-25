package MyPackage;

import java.util.Scanner;

public class typecasteceltofah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minf = 0;
		int maxf = 100;
		int step = 20;
		for (int f = minf; f <= maxf; f+= step) {
		int c = (((f-32)*5)/9);
		System.out.println(c);
	}
}
}