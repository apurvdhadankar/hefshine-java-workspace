package patterns;

public class FlagPattern {

	public static void main(String[] args)
	{
		for(int i=0; i<=9; i++) {
			for(int j=0; j<=5; j++)
			{
				if(j-i<=-4 || i+j <=4)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}

