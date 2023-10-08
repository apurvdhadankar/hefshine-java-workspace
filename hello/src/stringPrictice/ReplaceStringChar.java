package stringPrictice;

public class ReplaceStringChar {

	public static void main(String[] args) {
		String s = "ajjdjkdsijsdndj";
		char []a = s.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]=='d')
			{
				a[i]='f';
			}
		}
		String b = new String(a);
		System.out.println(a);
		
	}

}
