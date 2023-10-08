package prrree;

public class Q3_Saddle {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},
					{4,5,7},
					{11,15,8}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				boolean smallest=true;
				for (int k = 0; k < a[i].length; k++) 
				{
					if(a[i][j]>a[i][k])
					{
						smallest=false;
					}
				}
				boolean largest=true;
				for (int k = 0; k < a[i].length; k++) 
				{
					if(a[i][j]<a[k][j])
					{
						largest=false;
					}
				}
				if(largest && smallest)
				{
					System.out.println(a[i][j]);
				}
				
				
			}
		}
		
		
		

	}

}
