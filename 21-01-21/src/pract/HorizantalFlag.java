package pract;

public class HorizantalFlag {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j <13; j++) 
			{
				if(i+j<=6 || j-i>=6)
				{
					if(j<=6)
					System.out.print((char)(65+j));
					else
						System.out.print((char)(77-j));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
