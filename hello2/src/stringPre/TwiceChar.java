package stringPre;

public class TwiceChar {

	public static void main(String[] args) {
		String s= "abcdef";
		char c[] = s.toCharArray();
		int index=0;
		char[] ca = new char[s.length()*2];
		for (int i = 0; i < c.length; i++)
		{
			ca[index]=c[i];
			index++;
			ca[index]=c[i];
			index++;
		}
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}

	}

}
