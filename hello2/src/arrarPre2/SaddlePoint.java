package arrarPre2;

public class SaddlePoint {

	public static void main(String[] args) {
		int[][] a = {{6, 3, 1},
					{9, 7, 8},
					{2, 4, 5}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				boolean largest=true;
				for (int k = 0; k < 3; k++) 
				{
					if(a[i][k]<a[i][j])
					{
						largest=false;
					}	
				}
				boolean smallest = true;
				for (int k = 0; k < 3; k++) 
				{
					if(a[k][j]>a[i][j])
					{
						smallest=false;
					}
				}
				if(largest&&smallest)
					System.out.println(a[i][j]);
			}
		}

	}

}
