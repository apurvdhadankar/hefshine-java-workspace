package stringPre;

public class ConvertToLower {

	public static void main(String[] args) {
		String s = "ABCDEFGH";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=65 && c[i]<=90)
			{
				c[i]=(char) (c[i]+32);
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]);
		}

	}

}
