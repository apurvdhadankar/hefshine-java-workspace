package arrays;

public class FindAverageOfInnerElementsOfMatrix {

	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},
					{5,6,7,8},
					{9,0,1,2},	
					{3,4,5,6}};
		int sum=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i!=0 && i!=3 && j!=0 && j!=3)
				{
					
					sum += a[i][j];
					cnt++;
				}
			}
		}
		double avg = sum/cnt;
		System.out.println("Sum is "+sum+" & Average is "+ avg);

	}

}
