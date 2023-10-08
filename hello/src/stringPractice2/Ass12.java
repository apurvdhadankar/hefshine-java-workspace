package stringPractice2;

public class Ass12 {

	public static void main(String[] args) {
		String s = "apurv";
		char ca[] =s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]>=97)
			{
				ca[i] = (char)(ca[i]-32);
			}
		}
//		for (int i = 0; i < ca.length; i++) 
//		{
//			System.out.print(ca[i]);
//		}
		s = new String(ca);
		System.out.println(s);

	}

}
