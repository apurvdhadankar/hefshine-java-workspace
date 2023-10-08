package patterns;

public class Assignment70 {

	public static void main(String[] args) {
		for(int i=0 ;i<10; i+=2)
		{
			
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
