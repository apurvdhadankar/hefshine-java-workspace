package arrayAttempt2;

import java.util.Scanner;

public class Take10Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter Array");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		int evencnt=0;
		int oddcnt=0;
		int poscnt=0;
		int negcnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				System.out.println("Even : "+a[i]);
				evencnt++;
			}
			else if(a[i]%2!=0)
			{
				System.out.println("Odd  Numbers : "+a[i]);
				oddcnt++;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			 if(a[i]>=0)
			{
				System.out.println("Positive : "+a[i]);
				poscnt++;
			}
			else if(a[i]<0)
			{
				System.out.println("Negative : "+a[i]);
				negcnt++;
			}
		}
		System.out.println("Even "+evencnt);
		System.out.println("Odd "+oddcnt);
		System.out.println("Positive "+poscnt);
		System.out.println("Negative "+negcnt);
	}

}
