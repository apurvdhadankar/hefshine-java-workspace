package patterns;

public class Assignment57 {

	public static void main(String[] args) {
		int a=0;
		for(int i=0 ;i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				{
					System.out.print(a+1+" ");
					a++;
				}
			}
			System.out.println();
		}

	}

}
