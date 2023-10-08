package setA;

public class Q5_UnsingConct {

	public static void main(String[] args) {
		String s =  "    aaaa   bbbbb     c      ddddd    ";
		int si=0, ei=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i >= 0; i--) 
		{
			if(s.charAt(i)!=' ') {
				ei=i;
				break;
		}
		}
		String ss = "";
		for (int i = si; i <= ei; i++) 
		{
			ss = ss + s.charAt(i);
		}
		System.out.println(ss);
		
		String z = " ";
		for (int i = 0; i < ss.length(); i++) 
		{
			if(ss.charAt(i) == ' ' && ss.charAt(i+2)== ' ')
			{}
			else
			{
				z = z+ss.charAt(i);
			}
		}
//		System.out.println(z);
		System.out.println(z+" ");

	}

}
