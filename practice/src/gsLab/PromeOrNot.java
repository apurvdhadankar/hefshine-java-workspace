package gsLab;

public class PromeOrNot {

	public static void main(String[] args) {
		int n=113;
		int flag=0;
		for (int i = 2; i < n ; i++) 
		{
			if(n%i==0)
			{
				flag=1;
				System.out.println("Not Prime");
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime");
		}

	}

}
