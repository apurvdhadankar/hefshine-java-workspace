package arrays;

public class TwoDArraySecond {

	public static void main(String[] args) {
//		int[] a = {1,2,3,4};
//		int[] b = {5,6,7,8};
//		int[] c = {9,0,1,2};
//		int[] d = {3,4,5,6};
		int[][] arr= {{1,2},
					{5,6,7,8},
					{9,0,1,2},
					{3,4,5,6}};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
