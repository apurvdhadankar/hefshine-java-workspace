package stringPre;

public class CW4 {

	public static void main(String[] args) {
		String a = "aAcd", b = "aacd";
//		System.out.println(a.compareToIgnoreCase(b));
		boolean  flag = true;
		int c=0;
		if(a.length() != b.length())
		{
			System.out.println("Length is not Same");
		}
		else
		{
			for (int i = 0; i < a.length(); i++) 
			{
				if(a.charAt(i)==b.charAt(i))
				{
					flag = true;
				}
				else if(a.charAt(i)>=97 && a.charAt(i)<=122)
				{
					 c = a.charAt(i)-32;
					 if(c==b.charAt(i))
						 flag=true;
					 else
					 {
						 flag=false;
						 break;
					 }
					 
				}
				else if(a.charAt(i)>=65 && a.charAt(i)<=90)
				{
					c = a.charAt(i)+32;
					if(c==b.charAt(i))
						flag=true;
					 else
					 {
						 flag=false;
						 break;
					 }
				}
			
//				if(c==b.charAt(i))
//				{
//					flag = true;
//				}
				else
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("Same");
		}
		else
			System.out.println("Not Same");
		

	}

}
