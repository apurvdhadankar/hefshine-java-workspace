package gsLab;

public class CountFrequncyOfEachCahr {

	public static void main(String[] args) {
		String s = "aaaaabbbbbfAffggggaaaccvvvn";
		int[] a= new int[128];
		for (int i = 0; i < s.length(); i++) 
		{
			int b = s.charAt(i);
			a[b]++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				System.out.println((char)(i)+"-> "+a[i]);
			}
		}
		
		System.out.println("\n\n");
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			int cnt=1;
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]==c[j])
				{
					c[j]=0;
					cnt++;
					
				}
			}
			if(c[i]!=0)
				System.out.println(c[i]+" "+cnt);
		}
	}

}
