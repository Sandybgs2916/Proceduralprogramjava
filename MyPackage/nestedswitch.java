package MyPackage;

import java.util.Scanner;

public class nestedswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empid = sc.nextInt();
		String department = sc.next();
		switch (empid) {
		case 1:
			System.out.println("Kunal Kushwaha");
			break;
		case 2:
			System.out.println("Sandeep Kumar");
			break;
		case 3:
			System.out.println("Other employee");
			switch (department) {
			case "IT":
				System.out.println("IT Department");
				break;
			case "Management":
				System.out.println("Management Department");
				break;
				default:
					System.out.println("Other Department");
			}
			break;
		default:
			System.out.println("Other person");
		}
	}
	}
