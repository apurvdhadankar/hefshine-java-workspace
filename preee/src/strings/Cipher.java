package strings;

public class Cipher {

	public static void main(String[] args) {
		String s = "abcXYZ";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i] >= 'a' && c[i] <='z')
			{
				c[i] = (char) (c[i]-32);
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			c[i] = (char) (155-c[i]);
		}
		System.out.println(c);
	}
}