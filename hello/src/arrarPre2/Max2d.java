package arrarPre2;

public class Max2d {

	public static void main(String[] args) {
		int[][] a = {{1,2},{4,5},{6,7},{8,9}};
		int min=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j] > min)
				{
					min = a[i][j];
				}
			}
		}
		System.out.println(min);

	}

}
