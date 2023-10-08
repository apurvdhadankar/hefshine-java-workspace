package hashMap;

import java.util.HashMap;
import java.util.Map;

public class H8 {

	public static void main(String[] args) {
		int[] a = {5,7,1,2,0,8};
		int b[] = new int[a.length];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2!=0)
			{
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = i+1; j < b.length; j++) 
			{
				if(b[i]<b[j] && b[i]!=0 && b[j]!=0)
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		int p = 0;
		int q = index;
		int mid = (p+q)/2;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				b[index++]=a[i];
			}
		}
		
//		int p = 0;
//		int q = a.length;
//		int mid = (p+q)/2;
		System.out.println(b[mid]);
		
	}

}
