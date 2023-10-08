package hwAssigmnent;

public class Assignment14 {

	public static void main(String[] args) {
		int a[]=  {1,2,3,4,5,6,7};
		int b[] = {1,2,3,4,5,8,7};
		boolean flag=true;
		if(a.length != b.length)
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
			if(flag)
				System.out.println("Same");
			else
				System.out.println("Not Same");
			
		}

	}

}
