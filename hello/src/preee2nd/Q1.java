package preee2nd;

public class Q1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) 
		{
			int a=65;
			for (int j = 0; j < 9; j++) 
			{
				if(i+j<4 || j-i>4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print((char) (a));
					if(j<4)
					{
						a++;
					}
					else
					{
						a--;
					}
				}
			}
			System.out.println();
		}
	}

}
