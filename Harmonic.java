package com.bl;

public class Harmonic 

{
	
	     
		// Function to find N-th Harmonic Number
		static double nthHarmonic(int N)
		{
		    // H1 = 1/1
		    float harmonic = 1/1;
		 
		    // loop to apply the formula
		    // Hn = H1 + H2 + H3 ... + 1/1 + 1/2 + 1/3 + ... + 1/N
		    for (int i = 2; i <= N; i++) 
		    {
		        harmonic += (float)1 / i;
		    }
		 
		    return harmonic;
		}
		 
		// Driver Code
		 
		    public static void main (String[] args) {
		            int N = 8;
		     
		    System.out.print(nthHarmonic(N));
		     
		    }

}
