package stringPractice2;

public class Ass13 {

	public static void main(String[] args) {
		String s = "apudrv";
		char rm = 'd';
		char ca[] = s.toCharArray();
		int count=0, bindex=0;
		for (int i = 0; i < ca.length; i++) {
			if(ca[i]==rm)
			{
				count++;
			}
		}
		System.out.println(count);
		char b[] = new char[s.length()-count];
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i] != rm)
			{
				b[bindex]=ca[i];
				bindex++;
			}
		}
		s = new String(b);
		System.out.println(b);

	}

}
