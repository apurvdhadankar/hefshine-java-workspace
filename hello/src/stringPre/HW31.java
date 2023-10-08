package stringPre;

public class HW31 {

	public static void main(String[] args) {
		String s = "abcXYZ";
		char ca[] = s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]>=97 && ca[i]<=122)
				ca[i]=(char) (ca[i]-32);
		}
		for (int i = 0; i < ca.length; i++) 
		{
			ca[i]=(char) (155-ca[i]);
		}
		s = new String(ca);
		System.out.println(s);
	}

}
