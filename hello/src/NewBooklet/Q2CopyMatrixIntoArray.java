package NewBooklet;

import java.util.ArrayList;

public class Q2CopyMatrixIntoArray {

	public static void main(String[] args) {
		int[][] a =  {{1,2,3,4},{2,2,3,4},
		         {5,5,6,6},{7,8,9,9}};


//		int[] k = new int[a.length*a.length];
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				al.add(a[i][j]);
			}
		}
		for (int i = 0; i < al.size(); i++) 
		{
			for (int j = i+1; j < al.size(); j++)
			{
				if(al.get(i)>al.get(j))
				{
				int p = al.get(i);
				int q = al.get(j);
				al.set(i, q);
				al.set(j, p);
				}
			}

			
			
		}
		System.out.println(al);
	}

}
