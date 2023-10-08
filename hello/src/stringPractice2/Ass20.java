package stringPractice2;

public class Ass20 {

	public static void main(String[] args) {
		String s = "abcdeeffccddee";
		char ca[] = s.toCharArray();
		int count=0;
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j = i+1; j < ca.length; j++) 
			{
				if(ca[i]==ca[j])
				{
					count++;
					break;
				}
			}
		}
		int unilen=s.length()-count;
		System.out.println(unilen);
		char[] ca2 = new char[unilen];

		int caind=0;
		for (int i = 0; i < s.length(); i++) 
		{
			boolean flag=true;
			for (int j = 0; j < ca2.length; j++) 
			{
				if(ca2[j]  == s.charAt(i))
				{
					flag=false;
				}
			}
			if(flag)
			{
				ca2[caind]=s.charAt(i);
				caind++;
			}
		}
		
		for (int i = 0; i < ca2.length; i++) {
			System.out.print(ca2[i]);
		}
		System.out.println();
		
		s = new String(ca2);
		System.out.println(ca2);
		

	}

}
