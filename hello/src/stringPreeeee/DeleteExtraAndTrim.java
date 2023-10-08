package stringPreeeee;

public class DeleteExtraAndTrim {

	public static void main(String[] args) {
		String s = "            aaa       bbb       vv  cc         ";
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
			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		char[] ca= new char[ei-si+1];
		int index=0;
		for (int j = si; j <= ei; j++) 
		{
			ca[index++]=s.charAt(j);
		}
		int count=0;
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]==' ' && ca[i+1]==' ')
			{
				count++;
			}
		}
		char[] ca1 = new char[ca.length-count];
		index=0;
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]==' ' && ca[i+1]==' ')
			{}
			else
			{
				ca1[index++]=ca[i];
			}
		}
		System.out.println(ca1);

	}

}
