package array;

public class UniquePairs {

	public static void main(String[] args) {
		int[] a = {1,1,2};
		int cnt=0;
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
		int[] b = new int[a.length-cnt];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
					cnt++;
			}
			if(cnt==0)
			{
				b[index++]=a[i];
			}
		}
		
		cnt=0;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i] +" "+b[j]);
				cnt++;
			}
		}

		System.out.println("Count "+cnt);
		
	}

}
