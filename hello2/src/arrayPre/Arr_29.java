package arrayPre;

public class Arr_29 {

	public static void main(String[] args) 
	{
		int[] a = {4,5,6,7,8,9};
		int n=15;
		int sum=0;
		boolean flag=false;
		for (int i = 0; i < a.length; i++) 
		{
			sum=a[i]+sum;
			if(sum==n)
			{
				System.out.println(i);
				flag = true;
				break;
			}
				
		}
		if(!flag)
			System.out.println("Not Present");
	}

}
