package patterns;

public class Assignment34 {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(i+j<6)
				{
					System.out.print((char)(65+j));
				}
			}
			System.out.println();
	}

}
}