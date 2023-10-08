package stringPre;

public class HW26 {

	public static void main(String[] args) {
		String s = "abcde";
		int index=0;
		char[] c = new char[s.length()*2];
		for (int i = 0; i < s.length(); i++) 
		{
			c[index]=s.charAt(i);
			index++;
			c[index]=s.charAt(i);
			index++;
		}
		s = new String(c);
		System.out.println(s);
		
		

	}

}
