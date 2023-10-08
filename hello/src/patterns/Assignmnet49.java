package patterns;

public class Assignmnet49 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i>0) //i+j<9
				{
					System.out.print(" ");
				}
			}
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
					System.out.print(j+1);
					
			}
			System.out.println();
		}
	}

}
