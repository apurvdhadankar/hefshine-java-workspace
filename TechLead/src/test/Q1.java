package test;

public class Q1 {
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3},
					{4, 5, 6},
					{9, 8, 9 }};
		int ltr=0;
		int rtl=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(j-i==0)
				{
					ltr = ltr + a[i][j];
				}
				if(i+j==2)
				{
					rtl = rtl + a[i][j];
				}
			}
		}
		System.out.println(ltr);
		System.out.println(rtl);
		if(ltr>rtl)
			System.out.println("Absoltue Difference is : "+(ltr-rtl));
		else
			System.out.println("Absoltue Difference is : "+(rtl-ltr));

	}

}
