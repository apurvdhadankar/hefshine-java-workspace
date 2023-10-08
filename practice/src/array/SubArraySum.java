package array;

public class SubArraySum {
	
		  public static int maxSum(int arr[], int n, int k)
		    {
		        // k must be greater
		        if (n < k)
		        {
		           System.out.println("Invalid");
		           return -1;
		        }
		       
		        // Compute sum of first window of size k
		        int res = 0;
		        for (int i=0; i<k; i++)
		           res += arr[i];
		       
		        // Compute sums of remaining windows by
		        // removing first element of previous
		        // window and adding last element of 
		        // current window.
		        int curr_sum = res;
		        for (int i=k; i<n; i++)
		        {
		           curr_sum += arr[i-k]- arr[i]  ;
		           res = Math.min(res, curr_sum);
		        }
		       
		        return res;
    }

	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 0, 4 };
		 int k = 3;
	        int n = arr.length;
	        System.out.println(maxSum(arr, n, k));
	}

}
