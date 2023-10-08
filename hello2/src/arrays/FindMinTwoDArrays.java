package arrays;

public class FindMinTwoDArrays {

	public static void main(String[] args) {
		int[][] arr= {{1,2},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6}};
		int max = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(max>arr[i][j])
					max=arr[i][j];
					
			}
		}
		System.out.println(max);

	}

}
