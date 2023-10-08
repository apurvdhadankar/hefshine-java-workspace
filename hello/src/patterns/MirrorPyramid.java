
package patterns;

public class MirrorPyramid 
{

	public static void main(String[] args) 
	{
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i+j>=4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i>-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
