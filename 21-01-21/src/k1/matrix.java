package k1;


public class matrix {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		String m = "";
		int sum=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			sum=0;
			for (int j = 0; j < a[i].length; j++) 
			{
				sum =sum + a[j][i];
			}
			String oct = Integer.toOctalString(sum);
			for (int j = 0; j < oct.length(); j++) 
			{
				if(oct.charAt(j)!='1')
				{
					 m = oct;
				}		
			}
		}
		System.out.println(m);
		int b = Integer.parseInt(m,8);
		System.out.println(b);
	}

}
