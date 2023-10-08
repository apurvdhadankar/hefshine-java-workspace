package patterns;

public class Assignment36 {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(65+(i-j)));
				}
			}
			System.out.println();
			
		}
	}

}
