// used hashing and sets for it

import java.util.HashSet;
import java.util.Set;


public class PrimeNumbers{
	
	static boolean isPrime(int n) {
	    for(int i=2;i<=n-1;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static Set<Integer> primeFactors(int n) {
	    Set<Integer> factors = new HashSet<Integer>();
	    for (int i = 2; i <= n; i++) {
	      while (n % i == 0) {
	        factors.add(i);
	        n /= i;
	      }
	    }
	    return factors;
	  }
}

