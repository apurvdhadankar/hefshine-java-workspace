package stringPre;

public class HW23 {

	public static void main(String[] args) {
		String s = "   Aaiye apka   Intejarr   hain     ";
		int si=0;
		int ei=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) != ' ')
			{
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i > 0; i--) 
		{
			if(s.charAt(i) != ' ')
			{
				ei=i;
				break;
			}
		}
		char[] ca = new char[(ei-si)+1];
		int index=0;
		for (int i = si; i <= ei; i++) 
		{
			ca[index]=s.charAt(i);
			index++;
		}
//		for (int i = 0; i < ca.length; i++) {
//			System.out.print(ca[i]);
//		}
		s = new String(ca);
		System.out.println(ca);

	}

}
