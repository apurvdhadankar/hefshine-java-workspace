package stringPre;

public class HW8 {

	public static void main(String[] args) {
		String  s = "abcdefdre";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]=='d')
			{
				c[i]='f';
			}
		}
		s = new String(c);
		System.out.println(s);
				

	}

}
