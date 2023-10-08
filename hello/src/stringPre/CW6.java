package stringPre;

public class CW6 {

	public static void main(String[] args) {
		String s="abcd", s1="abcd";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}

	}

}
