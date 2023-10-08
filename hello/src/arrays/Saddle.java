package arrays;

public class Saddle {

	public static void main(String[] args) 
	{
		int a[][] = {{6,9,2},
				{9,7,8},
				{2,4,5}};

		for(int i=0; i<a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				boolean smallest = true;
				for(int k=0; k<3; k++)
				{
					if(a[i][k]<a[i][j])
					{
						smallest=false;
	//					System.out.println(smallest);
					}
				}
				boolean largest = true;
				for (int p = 0; p < a[i].length; p++) 
				{
					if(a[p][j]>a[i][j])
					{
						largest = false;
						//System.out.println(largest);
					}
				}
				if(largest && smallest)
					System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}
}

