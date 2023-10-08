public class Q1 {
	public static void main(String[] args) throws InterruptedException {
		int[][] a = new int[3][3];
		int cnt=0;
//		int[][] a = {{1,2,3},
//					{8,9,4},
//					{7,6,5}};
		int imin=a[0][0], jmin=a[0][0], imax=a[a.length-1][a.length-1];
		int jmax=a[a.length-1][a.length-1];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				cnt++;
				System.out.print(cnt);
				cnt++;
				if(cnt<imax)
				{
					System.out.print(cnt++);
				}
			}
			System.out.println();
		}
		
		}
	}
