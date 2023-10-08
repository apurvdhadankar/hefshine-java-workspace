package array;

import java.util.Arrays;
import java.util.Scanner;

public class MiniumXor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the test cases");
		int A = sc.nextInt();
		while(A!=0)
		{
			System.out.println("enter the array size");
			int n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("enter the array");
			for (int i = 0; i < n; i++) 
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int min = Integer.MAX_VALUE;
			int sum=0;
			int p=0, q=0;
			for (int i = 0; i < a.length-1; i++) 
			{
				sum = ((a[i]&a[i+1])^(a[i]|a[i+1]));
				if(sum<min)
				{
					min=sum;
				}
				sum=0;
			}
			System.out.println(min);
			--A;
		}
	}

}
