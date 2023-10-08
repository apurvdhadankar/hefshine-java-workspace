package arrays;

public class TripletsAddition {

	public static void main(String[] args) {
		int[] a = {5,1,3,4,7};
		int s=12;
		int sum=0;
		int cnt=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				for(int k=j+1; k<a.length; k++)
				{
					sum=(a[i]+a[j]+a[k]);
					if(sum<s)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		

	}

}
