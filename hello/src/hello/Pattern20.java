package hello;

public class Pattern20 {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i=i+2) 
		{
			int a=(i/2)+1;
			for (int j = 0; j < 7; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(a);
					if(j<i/2)
					a--;
					
					else
						a++;
				}
			}
			System.out.println();
		}
	}

}
