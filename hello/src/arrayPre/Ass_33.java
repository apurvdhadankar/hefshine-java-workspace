package arrayPre;

import java.util.Scanner;

public class Ass_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a[] = new int[10];
//		System.out.println("Enter array Elements");
//		for (int i = 0; i < a.length; i++) 
//		{
//			a[i]=sc.nextInt();
//		}
		int a[] = {1,2,3,-8,9,-6,-4};
		int evencnt=0, oddcnt=0, neg=0, pos=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evencnt++;
				
			}
			else if(a[i]%2!=0)
			{
				oddcnt++;
			}
			if(a[i]>0)
				pos++;
			else
			{
				neg++;
				
			}
		}
		System.out.println("Even Count "+evencnt);
		System.out.println("Odd Count"+oddcnt);
		System.out.println("Pos Count "+pos);
		System.out.println("Neg Count"+neg);

	}

}
