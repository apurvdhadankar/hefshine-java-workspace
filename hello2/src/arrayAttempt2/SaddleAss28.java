package arrayAttempt2;

public class SaddleAss28 {

	public static void main(String[] args) {
		int a[][] = {{6,3,1},
					{9,7,8},
					{2,4,5}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				boolean smallest = true;
				for(int k=0; k<a[i].length; k++)
				{
					if(a[i][k]<a[i][j])
					{
						smallest = false;
					}
				}
				boolean largest = true;
				for(int l=0; l<a[i].length; l++)
				{
					if(a[l][j]>a[i][j])
					{
						largest = false;
					}
				}
				if(largest&&smallest)
					System.out.println(a[i][j]);
			}
		}
		
		}
	}


