package gsLab;

public class Prime1to200 {

	public static void main(String[] args) {
		int n=200;
		for (int i = 1; i < n; i++) 
		{
			int flag=0;
			for (int j = 2; j < i; j++) 
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(i);
		}

	}

}
