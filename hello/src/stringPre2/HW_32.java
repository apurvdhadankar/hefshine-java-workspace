package stringPre2;

public class HW_32 {

	public static void main(String[] args) {
		String s = "Welcome to Java world";
		System.out.println(s.charAt(4));
		String s1 = "Welcome";
		System.out.println(s.compareToIgnoreCase(s1));
		String s2 = "Let us Learn";
		System.out.println(s+" "+s2);
		System.out.println("Index if a "+s.indexOf('a'));
		char ca[] = s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]=='a')
			{
				ca[i]='e';
			}
		}
		s = new String(ca);
		System.out.println(s);
		for (int i = 4; i < 10; i++) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
