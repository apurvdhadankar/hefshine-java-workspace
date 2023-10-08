package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class MissingNumberInArray {

	public static void main(String[] args) {
//		int[] arr = {1, 3, 6, 2, 4};
		int[] arr = {1};
//		int[] arr = {6,1,2,8,3,4,7,10,5};
		// 1 2 3 4 5 6		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		int n = arr.length;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(n==1) {
				if (arr[i] == 1)
					System.out.println();
				else
					System.out.println(2);
			}
			if (arr[i] + 1 != arr[i+1]) {
				
				System.out.println(arr[i]+1);
				
			}
		}
		
		
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//		System.out.println();
//		for (int i = 0; i < arr.length-1; i++) {
//			if (arr[i] + 1 != arr[i+1]) {
//				
//				System.out.println(arr[i]+1);
//				
//			}
//		}
	}
	
//	System.out.println("I "+ arr[i]);
//	System.out.println("I+1 "+arr[i+1]);

}
