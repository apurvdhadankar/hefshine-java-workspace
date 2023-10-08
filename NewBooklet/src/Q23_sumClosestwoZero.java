//import java.util.Arrays;

public class Q23_sumClosestwoZero {

	public static void main(String[] args) {
		int[] a = {-21, -67, -37, -18, 4, -65};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		int positive=0, negative=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<0)
			{
				negative++;
			}
			if(a[i]>0)
			{
				positive++;
			}
		}
		if(negative==a.length)
		{
			System.out.println(a[a.length-1]+" "+a[a.length-2]);
			System.out.println(a[a.length-1]+a[a.length-2]);
		}
		else if(positive==a.length)
		{
			System.out.println(a[a.length-1]+" "+a[a.length-2]);
			System.out.println(a[a.length-1]+a[a.length-2]);
		}
		else
		{
			for (int i = 0; i < a.length-1; i++) 
			{
				if(a[i]<0 && a[i+1]>0)
				{
					System.out.println(a[i]+" "+a[i+1]);
					System.out.println(a[i]+a[i+1]);
				}
			}
		}
		
	}
}
