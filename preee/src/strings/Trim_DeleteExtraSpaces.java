package strings;

public class Trim_DeleteExtraSpaces {

	public static void main(String[] args) {
		String s = "    aaa    bbb      fff    gggg";
		int si=0, ei=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i >=0; i--) 
		{
			if(ei!=' ')
			{
				ei=i;
				break;
			}
		}
		char[] ca = new char[si+ei];
		int index=0;
		for (int i = si; i <= ei; i++) 
		{
			ca[index++] = s.charAt(i);
		}
		System.out.println(ca);
		int cnt=0;
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]==' ' && ca[i+1]==' ')
			{
				cnt++;
			}
		}
		char[] c = new char[ca.length-cnt];
		cnt=0;
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]==' ' && ca[i+1]==' ')
			{}
			else
			{
				c[cnt++]=ca[i];
			}
		}
		System.out.println(c);

	}

}
