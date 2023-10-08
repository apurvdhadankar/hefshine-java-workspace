package patterns;

public class Assignment27 {

	public static void main(String[] args) {
		int a=65;
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0 && i+j<9) //i+j<9
				{
					if(i<4)
						System.out.print((char)(65+i));
					else
						System.out.print((char)(73-i));
				}
			}
			System.out.println();
		}


	}

}
