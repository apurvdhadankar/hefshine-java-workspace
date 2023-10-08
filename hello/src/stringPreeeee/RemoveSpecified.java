package stringPreeeee;

public class RemoveSpecified {

	public static void main(String[] args) {
		String s = "abcde";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='c')
			{
				count++;
			}
		}
		char[] c = new char[s.length()-count];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!='c')
			{
				c[index++]=s.charAt(i);
			}
			
		}
		System.out.println(c);
		
		
	}
	

}
