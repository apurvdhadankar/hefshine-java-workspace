package string;

public class RmoveSpecifedCharacer {

	public static void main(String[] args) {
		String s = "cacbcccccccdceccc";
		char a[] = s.toCharArray();
		char ch = 'c';
		int count=0;
		int bindex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==ch)
			{
				count++;
				break;
			}
		}
		char b[] = new char[a.length-count];
		for (int i = 0; i < b.length; i++) 
		{
			if(a[i] != ch)
			{
				b[bindex] = a[i];
				bindex++;
			}
		}
		String s1 = new String(b);
		System.out.println(s1);

	}

}
