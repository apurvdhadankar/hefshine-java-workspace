package pre;

public class Q2 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) 
		{
			char c=65;
			for (int j = 0; j < 9; j++) 
			{
				if(j+i<4  ||  j-i>4)
				{
					System.out.print("");
				}
				else
				{
					System.out.print(c);
					if(j>3)
						c--;
					else
						c++;
				}
			
			}
			System.out.println();
		}
	}

}
