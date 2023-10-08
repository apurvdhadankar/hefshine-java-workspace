package patterns;

public class Assignment48 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 ) //i+j<9
				{
					System.out.print(9-i);
				}
				
			}
			System.out.println();

	}

}
}
