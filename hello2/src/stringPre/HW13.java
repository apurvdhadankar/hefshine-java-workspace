package stringPre;

public class HW13 {

	public static void main(String[] args) {
		String s = "abcdef";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='c')
			{
			
				cnt++;
			}
		}
		System.out.println("cnt"+cnt);
		char c[] = new char[s.length()-cnt];
		int k=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)!='c')
			{
				c[k]=s.charAt(i);
				k++;
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		

	}

}
