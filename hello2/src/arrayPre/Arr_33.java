package arrayPre;

public class Arr_33 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,-6,8,7};
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				System.out.println("Even :"+a[i]);
			}
			else
			{
				System.out.println("Odd "+a[i]);
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>=0)
			{
				System.out.println("Poitive "+a[i]);
			}
			else
			{
				System.out.println("Negative "+a[i]);
			}
		}

	}

}
