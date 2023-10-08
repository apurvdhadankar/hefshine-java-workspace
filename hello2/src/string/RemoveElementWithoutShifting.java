package string;

public class RemoveElementWithoutShifting {

	public static void main(String[] args) {
		String s = "abcdcecc";
		char a[] = s.toCharArray();
		int count=0;
		int bindex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]=='c')
			{
				count++;
				break;
			}
			
		}
		char b[] = new char[a.length-count];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] != 'c')
			{
				b[bindex] = a[i];
				bindex++;
			}
		}
		String s1 = new String(b);
		System.out.println(s1);

	}

}
