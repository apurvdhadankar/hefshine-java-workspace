package stringPractice2;

public class Ass11 {

	public static void main(String[] args) {
		String s = "APURV";
		char ca[] = s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]<=90)
			{
				ca[i] = (char) (ca[i]+32);
			}
		}
		s = new String(ca);
		System.out.println(s);
	}

}
