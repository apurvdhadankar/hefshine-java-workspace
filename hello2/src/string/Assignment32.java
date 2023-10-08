package string;

public class Assignment32 {

	public static void main(String[] args) {
		String s = "Welcome to Java World";
		String s1 ="Welcome";
		String s2 = " Let us learn";
		System.out.println(s.charAt(4));
		int res = s.compareToIgnoreCase(s1);
		System.out.println(res);
		String s3 = s.concat(s2);
		System.out.println(s3);
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='a')
			{
				System.out.println(i);
				break;
			}
		}
		char ca[] = s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]=='a')
			{
				ca[i]='e';
			}
		}
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		String s5 = new String(ca);
		System.out.println(s5.substring(4, 10));
		
		
		

	}

}
