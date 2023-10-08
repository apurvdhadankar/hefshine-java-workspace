package mains;

public class SplitWithoutMethod {

	public static void main(String[] args) {
		String s = "mann behka aadhi raat ko";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				cnt++;
			}
		}
//		System.out.println(cnt);
		String[] sa = new String[cnt+1];
		int saindex=0 ,si=0, ei=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)== ' ' || i==s.length()-1)
			{
				ei=i;
				
				if(s.charAt(i)==' ')
				{
					ei=i-1;
				}
				char[] c = new char[ei-si+1];
				int cindex=0;
				for (int j = si; j <= ei; j++) 
				{
					c[cindex++]=s.charAt(j);
				}
				String m = new String(c);
				sa[saindex++]=m;
				si=ei+2;
			}
		}
		
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
		

	}

}
