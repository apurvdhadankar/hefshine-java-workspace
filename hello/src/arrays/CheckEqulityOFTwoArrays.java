package arrays;

public class CheckEqulityOFTwoArrays {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
		boolean flag=true;
		if(a.length!=b.length)
		{
			System.out.println("Not Same");
		}
		else
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					flag=false;
				}
			}
			if(flag==true)
				System.out.println("Same");
			else
				System.out.println("Not Same From Second Else");
		}

	}

}
