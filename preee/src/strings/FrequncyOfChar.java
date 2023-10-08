package strings;

public class FrequncyOfChar {

	public static void main(String[] args) {
		String s = "aabbcccd";
		char[] ca = s.toCharArray();
		int cnt=0;
		for (int i = 0; i < ca.length; i++) 
		{
			cnt=1;
			for (int j = i+1; j < ca.length; j++) 
			{
				if(ca[i]==ca[j])
				{
					ca[j]=0;
					cnt++;
				}
			}
			if(ca[i]!=0)
			{
				System.out.println(ca[i]+" "+cnt);
			}
		}

	}

}
