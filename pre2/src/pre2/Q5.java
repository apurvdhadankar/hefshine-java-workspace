package pre2;

public class Q5 {

	public static void main(String[] args) {
		String s = "abcDXYZ";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=97 && c[i]<=122)
			{
				c[i]=(char)(c[i]-32);
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=65 && c[i]<=90)
			{
				c[i] = (char)(155-c[i]);
			}
		}
		s = new String(c);
		System.out.println(c);

	}

}
