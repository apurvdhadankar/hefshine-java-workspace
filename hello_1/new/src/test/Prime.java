package test;

import java.util.Iterator;

public class Prime {
//	int checkPrime(int num){
//	    if (num <= 1)
//	      { return 0; }
//	   // Check from 2 to half of arr[i]
//	   for (int j = 2; j <= num/2; j++){
//	      if (num % j == 0){
//	         return 0;
//	      }
//	      return 1;
//	   }
//	}

	public static void main(String[] args) {
		int[] a = {5,12,3,6,8,18};
			
		 for(int i=0; i<a.length; i++){
		        boolean isPrime = true;
		        for (int j=2; j<i; j++){
		            if(a[i]%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		        if(isPrime)

		            System.out.println(i);
		    }
		

	}

}
