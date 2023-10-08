package stringPre2;

public class HW_35 {

	public static void main(String[] args) {
		String s = "            fhgkjdf    x oigjdfi    oidfgk     digidj        ";
		s = s.trim();
		int count=0;
//		System.out.println(s);
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				count++;
			}
		}
		char[] c = new char[s.length()-count];
		int index=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(s.charAt(i)==' ' &&s.charAt(i+1)==' ')
			{}
			else
			{
				c[index++]=s.charAt(i);
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]);
		}
	}

}
