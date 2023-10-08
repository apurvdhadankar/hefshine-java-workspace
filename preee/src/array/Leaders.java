package array;

public class Leaders {

	public static void main(String[] args) {
		int[] a = {3,4,10,9,6,1,7};
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag = true;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					flag= true;
				}
				else
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(a[i]);
			}
		}

	}

}
