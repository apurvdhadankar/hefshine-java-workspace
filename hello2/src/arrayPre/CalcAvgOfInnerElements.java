package arrayPre;

public class CalcAvgOfInnerElements {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int count=0;
		int a[][] = {{1,5,6,7},
					{7,8,6,4},
					{4,5,6,2}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i!=0 && i!=2 && j!=0 && j!=3)
				{
					sum=sum+a[i][j];
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(sum);
		avg=sum/count;
		System.out.println(avg);

	}

}
