package patterns;

public class Assignment32 {

	public static void main(String[] args) {
		int a=65;
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(i+j<6)
				{
					System.out.print((char)(70-j));
				}
			}
			System.out.println();
		}

	}

}
	
