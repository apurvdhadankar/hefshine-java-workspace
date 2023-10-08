package arrays;

public class TwoDArrayFirst {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		int[] c = {9,0,1,2};
		int[] d = {3,4,5,6};
		int[][] arr= {a,b,c,d};
		for(int i=0; i<arr.length; i++)
		{
			int[] p = arr[i];
			for(int j=0 ; j<p.length; j++)
			{
				System.out.print(p[j]+" ");
			}
			System.out.println();
		}
		

	}

}
