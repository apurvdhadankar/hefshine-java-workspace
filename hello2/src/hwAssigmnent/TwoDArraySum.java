package hwAssigmnent;

public class TwoDArraySum {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},
				{4,5,6},
				{7,8,9},
				{0,1,2,3}};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				sum += a[i][j];
			}
		}
		System.out.println(sum);
		}

	}


