package strings;

public class ReverseStringMakeFirstCharCapital {

	public static void main(String[] args) {
		String s = "luta vrupa raknadahd";
		char[] c = s.toCharArray();
		int index=0;
		char[] ca = new char[s.length()];
		for (int i = s.length()-1; i >= 0; i--) 
		{
				if(c[c.length-1]>=97 && c[c.length-1]<=122)
				{
					c[i]=(char) (c[i]-32);
					
				}
				if(c[i]==' ')
				{
					if(c[i-1]>=97 && c[i-1]<=122)
					{
						c[i-1]=(char) (c[i-1]-32);
						
					}
				}
				ca[index++]=c[i];
		}
		System.out.println(ca);
	}

}
