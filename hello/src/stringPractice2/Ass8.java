package stringPractice2;

public class Ass8 {

	public static void main(String[] args) {
		String s = "dhad dahda dhada dhad";
		
		char ca[] = s.toCharArray();
		for (int i = 0; i < ca.length; i++)
		{
			if(ca[i]=='d')
			{
				ca[i]='f';
			}
		}
		s = new String(ca);
		System.out.println(s);

	}

}
