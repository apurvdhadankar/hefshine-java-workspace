package arrayPre;

public class MaxElementMatrix {

	public static void main(String[] args) {
		int a[][]= {{2,4,5},
				{3,6,7},
				{5,6,9}};
		int max=Integer.MIN_VALUE;;

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
		}
	}


