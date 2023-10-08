package strings;

public class SplitWitjoutMehod {

	public static void main(String[] args) {
		String s = "kajal apurv dhadanakr";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
				cnt++;
		}
//		System.out.println(cnt);
		String[] sa = new String[cnt+1];
		int si=0, ei=0, saindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ' || i==s.length()-1)
			{
				ei=i;
				if(s.charAt(i)==' ')
					ei=i-1;
				char[] ca = new char[ei-si+1];
				int caindex=0;
				for (int j = si; j <= ei; j++) 
				{
					ca[caindex++]=s.charAt(j);
				}
				String m = new String(ca);
				sa[saindex++]=m;
				si=ei+2;
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
	}

}
