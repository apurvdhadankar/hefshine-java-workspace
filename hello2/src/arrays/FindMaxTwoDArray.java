package arrays;

public class FindMaxTwoDArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6}};
		int min = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(min<arr[i][j])
				{
					min=arr[i][j];
				}
			}
			
		}
		System.out.println(min);

	}

}
