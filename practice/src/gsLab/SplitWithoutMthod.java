package gsLab;

public class SplitWithoutMthod {

	public static void main(String[] args) {
		String s = "apurv atul dhadanakr";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
				cnt++;
		}
		
		String[] sa = new String[cnt+1];
		int si=0, ei=0, index=0,sindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ' || i==s.length()-1)
			{
				ei=i;
				if(s.charAt(i)==' ')
					ei=i-1;
				char[] ca = new char[ei-si+1];
				index=0;
				for (int j = si; j <= ei; j++) 
				{
					ca[index++] = s.charAt(j);
				}
				String m = new String(ca);
				sa[sindex++] = m;
				si=ei+2;
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
	}

}
