package patterns;

public class MirrorFlag {

	public static void main(String[] args)
	{
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>-1 || i+j>7)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
