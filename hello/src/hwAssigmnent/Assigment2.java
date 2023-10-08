package hwAssigmnent;

public class Assigment2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,8,9};
		int c=4;
		boolean flag = false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==c)
				flag=true;
		}
		if(flag)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

	}


