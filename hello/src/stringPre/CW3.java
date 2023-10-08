package stringPre;

public class CW3 {

	public static void main(String[] args) {
		String a = "abcd", b="abce";
//		System.out.println(a.compareTo(b));
		boolean flag = true;
		for (int i = 0; i < a.length(); i++) 
		{
			if(a.charAt(i)==b.charAt(i))
			{
				flag = true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("0");
		else
			System.out.println("1");
		

	}

}
