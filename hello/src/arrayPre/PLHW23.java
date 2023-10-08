//23) Write a program to display outer elements of a matrix. i.e 2d array of size 6 x 6.

package arrayPre;

public class PLHW23 
{

	public static void main(String[] args)
	{
		int a[][] = 
				{{1,2,3,4},
				{5,6,7,8},
				{9,0,1,2},	
				{3,4,5,6}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if (i==0 || i==3 || j==0 || j==3)
					
				{
					System.out.print(a[i][j]);
				}
				else {System.out.print(" ");}
			}
			System.out.println();
		}
	}

}
