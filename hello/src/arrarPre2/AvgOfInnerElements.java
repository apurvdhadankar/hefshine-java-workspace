package arrarPre2;

public class AvgOfInnerElements {

	public static void main(String[] args) {
		int[][] a = {{2,3,1},{4,5,5},{6,7,4},{8,9,7}};
		int sum=0;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i==0 || j==0 || i==1 || j==1)
				{}
				else
				{
					sum = sum+  a[i][j];
					count++;
				}
			}
		}
		System.out.println(sum/count);

	}

}
