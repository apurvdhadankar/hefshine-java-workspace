package pract;

import java.util.Scanner;

public class SpiralPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num : ");
		int a= sc.nextInt();
		int len = (a-1)*2;
		for (int i = 0; i <= len; i++) 
		{
			for (int j = 0; j <= len; j++) 
			{
				if(i-j>=0 && i+j<=len)
				{
					if(j<=len/2)
					{
						System.out.print(a-j+" ");
					}
				}
				else if(i+j>=len && i-j<=0)
				{
					System.out.print(a-(len-j)+" ");
				}
				else
				{
					if(i<len/2)
					{
						System.out.print(a-i+" ");
					}
					else
					{
						System.out.print(a-(len-i)+" ");
					}
				}
			}
			System.out.println();
		}
		
	}

}
