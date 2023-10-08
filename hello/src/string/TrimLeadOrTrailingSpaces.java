package string;

public class TrimLeadOrTrailingSpaces {

	public static void main(String[] args) {
		String s = "    abcd abcde  abcdeeeeeeee abcdef  ";
//		String b =s.trim();
//		System.out.println(b);
		int si=0;
		int ei=0;
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
				if(s.charAt(i) !=' ')
				{
					si=i;
					break;
				}
		}
		for (int i = s.length()-1; i >0; i--) 
		{
			if(s.charAt(i) != ' ')
			{
				ei = i;
				break;
				
			}
		}
		char[] ca = new char[(ei-si)+1];
		int caindex=0;
		for (int i = si; i <= ei; i++) 
		{
			ca[caindex]=s.charAt(i);
			caindex++;
		}
		String s1 = new String(ca);
		System.out.println(s1);
	}

}
