
public class Q_22_ArrayPairSum {

	public static void main(String[] args) {
		int[] a = {2, 4, 1, 3};
		int k=6;
		int s = a.length/2;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if((a[i]+a[j])%k==0)
				{
					System.out.println(a[i]+" "+a[j]);
					cnt++;
					break;
				}
			}
		}
		if(cnt==s)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
