package neova;

public class PrimeNo {

	public static void main(String[] args) {
		int n = 7;
		boolean flag = true;
		if(n==0 && n==1)
		{
			System.out.println(n+" is not prime");
		}
		else
		{
			for (int i = 2; i < n; i++) 
			{
				if(i%n==0)
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
			System.out.println(n+" is prime");
	}

}
