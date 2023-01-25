package MyPackage;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		switch(button) {
		case 1 :
			System.out.println("hello");
			break;
		case 2 :
			System.out.println("namaste");
			break;
		case 3 :
			System.out.println("Bonjour");
			break;
			default:
				System.out.println("aur badhiya sab");
				break;
		}
   }
} 