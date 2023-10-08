package stringPre;

public class CW2 {

	public static void main(String[] args) {
		String s = "abcd efgh";
		System.out.println((s.charAt(7)));
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='g')
			{
				System.out.println("Present At "+i);
			}
		}

	}

}
