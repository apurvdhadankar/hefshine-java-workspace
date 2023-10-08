package stringPre;

public class HW28 {

	public static void main(String[] args) {
		String s = "   apbcd   efgh   klmn    ";
		int si=0,ei=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) != ' ')
			{
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i>=0; i--) 
		{
			if(s.charAt(i) != ' ')
			{
				ei=i;
				break;
			}
		}
		char ca[] = new char[(ei-si)+1];
		int index=0;
		for (int i = si; i <= ei; i++) 
		{
			ca[index++]=s.charAt(i);
		}
		
		s = new String(ca);
		System.out.println(s);
		
		
//		-----------------------------------
		
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
				if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
				{
					count++;
				}
			
		}
		char[] c = new char[s.length()-count];
		index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{}
			else
			{
				c[index++]=s.charAt(i);
			}
		}
//		for (int i = 0; i < c.length; i++) {
//			System.out.print(c[i]);
//		}
		s = new String(c);
		System.out.println(s);

	}


	}


