package array;

public class Saddle {

	public static void main(String[] args) {
		int[][] a = {{6,3,1},
					{9,7,8},
					{2,4,5}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				boolean largest=true;
				for (int k = 0; k < a.length; k++) 
				{
					if(a[i][k]<a[i][j])
						largest=false;
				}
				boolean smallest = true;
				for (int k = 0; k < a.length; k++) 
				{
					if(a[k][i]>a[i][j])
						smallest=false;
				}
				if(smallest&&largest)
					System.out.println(a[i][j]);
			}
		}
		}

	}


