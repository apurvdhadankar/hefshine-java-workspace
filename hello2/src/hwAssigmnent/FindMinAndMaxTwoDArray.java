package hwAssigmnent;

public class FindMinAndMaxTwoDArray {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},
				{4,5,6},
				{7,8,9},
				{0,1,2,3}};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0 ;i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j]>max) {
					max=a[i][j];
//					System.out.println("Max "+a[i][j]);
				}
				else if(a[i][j]<min)
				{
					min = a[i][j];
//					System.out.println("Min "+a[i][j]);
				}
			}
		}
		System.out.println("Max "+ max );
		System.out.println("Min "+ min);

	}

}
