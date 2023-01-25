package MyPackage;

public class countdigit {

	public static void main(String[] args) {
		
		 int n = 455325;
		 int count = 0;
		 int digit = 5;
		  while(n > 0) {
			  int rem = n % 10;
			  if(rem == digit) {
				  count++;
			  }
			  n = n/10;
		  }
		  System.out.println(count);
		 }
    }