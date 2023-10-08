package pre;

public class Q4_RemoveSpecific {

	public static void main(String[] args) {
		String s = "abcdcc";
		char[] ca = s.toCharArray();
		int cnt=0;
		for (int i = 0; i < ca.length; i++)
		{
			if(ca[i]=='c')
			{
				ca[i]=0;
				cnt++;
				break;
			}
		}
		
		char[] c = new char[ca.length-cnt];
		int cindex=0;
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]!=0)
			{
				c[cindex++]=ca[i];
			}
		}
		System.out.println(c);
	}

}
