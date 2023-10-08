package arrays;

import java.util.ArrayList;
import java.util.Collection;

public class SubArrayWithGivenSum {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		Collection<Integer> al = new ArrayList<>();
		al.add(-1);
		int currSum = 0;
        for (int i=0; i<n; i++) {
            currSum = arr[i];
            for (int j=i+1; j<n; j++) {
                if (currSum == s) {
                	 Collection<Integer> outputs = new ArrayList<>();
                	 outputs.add(++i); //Actual index i
                	 outputs.add(j); //Actual index j-1
                	 return (ArrayList<Integer>) outputs; 
                }
                
                if(currSum > s || j==n) 
                    break;
                    
                currSum += arr[j];
            }
        }
		return (ArrayList<Integer>) al;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,7,5};
		int sum = 156;
		int currSum = 0;
		int n = arr.length;
		System.out.println(subarraySum(arr, n, sum));
		
		
		
//		for (int i = 0; i < arr.length; i++) {
//			currSum = arr[i];
//			for (int j = i+1; j < arr.length; j++) {
//				if (currSum == sum) {
//					System.out.println("Sum found between indexes "+ ++i +"  "+ j);
//					break;
//				}
//				if (currSum > sum || j==arr.length)
//					break;
//				currSum = currSum + arr[j];
//			}
//		}

	}

}
