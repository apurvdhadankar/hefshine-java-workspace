package pract;

public class PrimeOrNot {

	public static void main(String[] args) {
		int prime=3;
		boolean flag=true;
		for (int i = 2; i < prime; i++) 
		{
			if(prime%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
