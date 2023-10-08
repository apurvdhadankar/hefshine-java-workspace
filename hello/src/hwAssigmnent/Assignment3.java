package hwAssigmnent;

import java.util.Arrays;

 
public class Assignment3 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,8,9};
		int c=4;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==c)
				a[i]=0;
				
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
				continue;
			System.out.print(a[i]+" ");
		}

	}

	}


