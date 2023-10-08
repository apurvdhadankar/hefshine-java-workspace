package setA;

public class Q5_DeleteExtraSpaces {

	public static void main(String[] args) {
	String s = "       aaaaa               bbb    bbb      cc        d      ";
	int si=0, ei=0;
	for (int i = 0; i < s.length(); i++) 
	{
		if(s.charAt(i)!=' ')
		{
			si = i-1;
			break;
		}
	}
	for (int i = s.length()-1; i >= 0; i--) 
	{
		if(s.charAt(i)!=' ')
		{
			ei=i+2;
			break;
		}
	}
	
	for (int i = si; i <= ei; i++) 
	{
		System.out.print(s.charAt(i));
	}
	System.out.println();
	int cnt=0;
	for (int i = si; i <= ei; i++) 
	{
		if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
		{
			cnt++;
		}
	}
	char[] c = new char[(ei-si+1)-cnt+2];
	int index=0;
	for (int i = si; i <= ei; i++) 
	{
		if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
		{}
		else
		{
			c[index++] = s.charAt(i);
		}
	}
	cnt=0;
	for (int i = 0; i < c.length-1; i++) 
	{
		if(c[i]!=' ' && c[i+1]==' ' && c[i+1]!=' ')
		{
			cnt++;
		}
	}
	char[] c1 = new char[c.length+cnt];
	index=0;
	for (int i = 0; i < c.length-1; i++) 
	{
		if(c[i]!=' ' && c[i+1]==' ')
		{
			c1[index++] = ' ';
		}
		else
		{
			c1[index++] = c[i];
		}
	}
	System.out.println(c1);
	
	
	}

}
