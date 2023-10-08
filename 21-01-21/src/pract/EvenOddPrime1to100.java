package pract;

public class EvenOddPrime1to100 {

	public static void main(String[] args) 
	{
		for (int i = 0; i <= 100; i++) 
		{
			if(i%2==0)
			{
				System.out.println("Even "+i);
			}
			else if(i%2!=0)
			{
				System.out.println("Odd "+i);
			}
			
		}
		int count=0;
		for (int i = 0; i < 101; i++) 
		{
			count=0;
			for (int j = 2; j < i; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("Prime "+i);
			}
		}
		

	}

}
