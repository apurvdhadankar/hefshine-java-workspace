package stringPre;

public class HW10 {

	public static void main(String[] args) {
		String s = "abbcdefg";
		char c[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) 
		{
			c[i] = s.charAt(i);
//			c[i]=a;
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]);
		}

	}

}
