package gsLab;

public class PalindreomeString {

	public static void main(String[] args) {
		String s1 = "bob";
		String s2 = "bob";
		char[] c = s2.toCharArray();
		if(s1.length()==s2.length())
		{
			for (int i = 0; i < c.length/2; i++) 
			{
				char temp = c[i];
				c[i] = c[c.length-1-i];
				c[c.length-1-i] = temp;
			}
			s2 = new String(c);
		}
		if(s1.compareTo(s2)==0)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrime");
	}

}
