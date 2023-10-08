package stringPre;

public class HW35 {

	public static void main(String[] args) {
		String s = "   abcd  fjd jdfkjd  jkfkd   ";
		s = s.trim();
//		System.out.println(s);
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
				if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
				{
					count++;
				}
			
		}
		char[] c = new char[s.length()-count];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{}
			else
			{
				c[index++]=s.charAt(i);
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

}
