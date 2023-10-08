package gsLab;

public class PrimeOrNot1 {

	public static void main(String[] args) {
		int n=97, m=n/2;
		int flag=0;
		if(n==0 || n==1) 
		{
			System.out.println(n+ " not prime");
		}
		else
		{
			for (int i = 2; i <= m; i++) 
			{
				if(n%i==0)
				{
					flag=1;
					System.out.println(n+ " not prime");
					break;
				}
			}
		
		if(flag==0)
			System.out.println(n+ " prime");
		}

	}

}
