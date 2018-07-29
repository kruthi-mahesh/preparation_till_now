// Java program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes
import java.util.*;
class SieveOfEratosthenes
{
	void sieveOfEratosthenes(int min,int n)
	{
		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n+1];
		ArrayList<Integer> res = new ArrayList<Integer>();
		Arrays.fill(prime,true);
	
		int p;
		res.add(2);
		for(p = 3; p*p <=n; p+=2)
		{
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
			    res.add(p);
			   // System.out.print(p + " ");
				// Update all multiples of p
				for(int i = p*p; i <= n; i += p)
					prime[i] = false;
			}
		}
		if(p%2 == 0)
		   p++;
		// Print all prime numbers
		for(int i = p; i <= n; i+=2)
		{
			if(prime[i] == true){
			    res.add(i);
			}
				
		}
		for(Integer i: res)
		    System.out.print(i + " ");
	}
	
	// Driver Program to test above function
	public static void main(String args[])
	{
		int n = 100;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(1,n);
	}
}

// This code has been contributed by Amit Khandelwal.
