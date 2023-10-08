package test;

public class Q3 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},
					{1,2,3},
					{12,2,3}};
		int index=0;
		int[] b  = new int[a.length*a.length];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				b[index++]=a[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			index=1;
			for (int j = i+1; j < b.length; j++)
			{
				if(b[i]==b[j])
				{
					b[j]=0;
					index++;
				}
			}
			if(b[i]!=0)
			{
				System.out.println(b[i]+" >> "+index);
			}
		}

	}

}
