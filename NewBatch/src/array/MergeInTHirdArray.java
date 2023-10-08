package array;

import java.util.Iterator;

public class MergeInTHirdArray {

	public static void main(String[] args) {
		int[] a = {5,8,9,61};
		int[] b = {8,9,612,3,0,4,7};
		int[] c = new int [a.length+b.length];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			c[index++]=a[i];
		
		}
		for (int i = 0; i < b.length; i++) 
		{
			c[index++]=b[i];
		}
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length-1-i; j++) 
			{
				if(c[j]>c[j+1])
				{
					int temp = c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}

	}

}
