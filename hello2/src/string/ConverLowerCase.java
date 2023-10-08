package string;

public class ConverLowerCase {

	public static void main(String[] args) {
		String s = "ABChdskjDEF";
		char[] ca = s.toCharArray();
 		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]>=65 && ca[i]<91)
			{
				ca[i]=(char) (ca[i]+32);
			}
		}
// 		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
//		}
 		 s = new String(ca);
 		 System.out.println(s);

	}

}
