package arrayAttempt1;

public class TripletsAss30 {

	public static void main(String[] args) {
		int[] a = {5,1,3,4,7};
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int j2 = j+1; j2 < a.length; j2++) 
				{
					int sum = a[i]+a[j]+a[j2];
					if(sum<12)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[j2]);
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
