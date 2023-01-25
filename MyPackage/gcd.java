package MyPackage;

public class gcd {

	public static void main(String[] args) {
		// using while loops
		int n1 = 81, n2 = 153;
	    
	    while(n1 != n2) {
	    
	      if(n1 > n2) {
	        n1 -= n2;
	      }	      
	      else {
	        n2 -= n1;
	      }
	    }
	    System.out.println("GCD: " + n2);
	  }
	}
  // using for loops 
		/*
int n1 = 81, n2 = 153;

// initially set to gcd
int gcd = 1;

for (int i = 1; i <= n1 && i <= n2; i++) {

  // check if i perfectly divides both n1 and n2
  if (n1 % i == 0 && n2 % i == 0)
    gcd = i;
}

System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
}
} 
*/