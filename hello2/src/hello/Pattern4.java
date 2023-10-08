package hello;

public class Pattern4 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) 
		{
			int a=i;
			for (int j = 0; j < 5; j++) 
			{
				if(i+j>=8 || j-i>=0)
				{
					System.out.print(j+1);
				}
			}
			System.out.println();
		}

	}

}
