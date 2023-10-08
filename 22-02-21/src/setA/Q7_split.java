package setA;

public class Q7_split {

	public static void main(String[] args) {
		String s = "abcPjklPxyz";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='P')
				cnt++;
		}
		String[] sa = new String[cnt+1];
		int si=0, ei=0, saindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='P' || i==s.length()-1)
			{
				ei=i;
				if(s.charAt(i)=='P')
				{
					ei=i-1;
				}
				int caindex=0;
				char[] ca = new char[ei-si+1];
				for (int j = si; j <= ei; j++) 
				{
					ca[caindex++] = s.charAt(j);
				}
				String x = new String(ca);
				sa[saindex++] = x;
				si = ei+1;
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
	}

}
