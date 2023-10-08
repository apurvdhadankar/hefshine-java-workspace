package arrayPre;

public class SpliitWthoutMethod {

	public static void main(String[] args) {
		String s = "kad lst cbk dak msj cnr";
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
//		System.out.println(count);
		String sa[] = new String[count+1];
		int si=0, ei=0, saindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			
			if(s.charAt(i)==' ' || i==s.length()-1)
			{
				ei=i;
			if(s.charAt(i)==' ')
				ei=i-1;
			char[] ca = new char[ei-si+1];
			int cai=0;
			for (int j = si; j <= ei; j++) 
			{
				ca[cai++] = s.charAt(j);
			}
			String m = new String(ca);
			sa[saindex++] = m;
			si=ei+2;
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}

	}

}
