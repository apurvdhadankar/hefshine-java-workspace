package stringPre;

public class HW12 {

	public static void main(String[] args) {
		String s = "abcdefg";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=97 && c[i]<=122)
			{
				c[i]=(char) (c[i]-32);
			}
		}
		s = new String(c);
		System.out.println(s);

	}

}
