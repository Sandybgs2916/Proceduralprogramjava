package MyPackage;

import java.util.*;

public class sumofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}