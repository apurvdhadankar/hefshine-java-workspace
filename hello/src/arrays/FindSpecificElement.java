package arrays;

public class FindSpecificElement
{

	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50,60};
		boolean flag=false;
		int c=80;
		for(int i=0; i<6; i++)
		{
			if(arr[i]==c)
				flag=true;
		}
		if(flag)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
	}

}
