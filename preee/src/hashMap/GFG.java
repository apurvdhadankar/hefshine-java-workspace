package hashMap;

public class GFG {
	
		static int count_same_digit(int L, int R) 
		{ 
		    int tmp = 0, ans = 0; 
		  
		    // Length of R 
		    int n = (int)Math.log10(R) + 1; 
		  
		    for(int i = 0; i < n; i++) 
		    { 
		      
		       tmp = tmp * 10 + 1; 
		       
		       for(int j = 1; j <= 9; j++) 
		       { 
		          if (L <= (tmp * j) && (tmp * j) <= R)  
		          { 
		              // Increment the required count 
		              ans++; 
		          } 
		       } 
		    } 
		    return ans; 
		} 
		  
		// Driver code 
		public static void main(String[] args) 
		{ 
		    int L = 2, R = 47; 
		  
		    System.out.println(count_same_digit(L, R)); 
		} 
		} 
		  
		// This code is contributed by offbeat 


