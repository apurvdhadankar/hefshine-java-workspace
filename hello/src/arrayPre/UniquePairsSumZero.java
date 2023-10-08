package arrayPre;

public class UniquePairsSumZero {

	public static void main(String[] args) {
		int[] a = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		int cnt=0, sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		int[] b= new int[a.length-cnt];
		int bindx=0;
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag=true;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
					flag=false;
			}
			if(flag)
			{
				b[bindx]=a[i];
				bindx++;
			}
			
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++)
		{
			for (int j = i+1; j < b.length; j++) 
			{
				sum=b[i]+b[j];
				if(sum==7)
				{
					System.out.println(b[i]+" "+b[j]);
				}
			}
			
		}
		
	}

}
