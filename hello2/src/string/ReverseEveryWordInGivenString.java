package string;

public class ReverseEveryWordInGivenString {

	public static void main(String[] args) {
		String s = "abc def ghij klmo pqrs tuvwx yz";
		String a[] = s.split(" ");
		for(int i=0; i<a.length/2; i++)
		{
			String p = a[i];
			String q = a[a.length-1-i];
			a[i] = q;
			a[a.length-1-i] = p;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		for(int i=0; i<a.length; i++)
		{
			String temp=a[i];
			char ch[] = temp.toCharArray();
			for(int j=0; j<ch.length/2; j++)
			{
				char p = ch[j];
				char q = ch[ch.length-1-j];
				ch[j] = q;
				ch[ch.length-1-j] = p;
			}
			for (int k = 0; k < a.length; k++) 
			{
				System.out.print(ch[k]);
			}
			String s1 = new String(ch);
			System.out.println(s1);
		}
		
		
	}

}
