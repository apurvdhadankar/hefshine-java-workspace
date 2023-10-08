
public class RangeOfPrimeNumbers {

	public static void main(String[] args) {
		int temp;
		for(int i=2; i<=60; i++)
		{
			temp=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0) {
					temp=1;
					break;
				}
			}
			if(temp==0)
				System.out.println(i + " is prime");
			else
				System.out.println(i + " is Not Prime");
		}

	}

}
