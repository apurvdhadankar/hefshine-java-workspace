package string;

public class DeleteAllExtraSpaces {

	public static void main(String[] args) {
		String s = "    Gian    Aquaman    Sunio    Doremon  Ambulance               ";
		int si=0, ei=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		for (int i = s.length()-1; i>=0 ; i--) 
		{
			if(s.charAt(i) != ' ')
			{
				ei=i;
				break;
			}
		}
		char[] c = new char[ei-si+1];
		int index=0;
		for(int i=si; i<= ei; i++)
		{
			c[index++]=s.charAt(i);
		}
		int count=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' '&& c[i+1]==' ')
			{
				count++;
			}
		}
//		System.out.println(count);
		char[] ca = new char[c.length-count];
		int caindex=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' '&& c[i+1]==' ')
			{}
			else
				ca[caindex++]=c[i];
		}
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]);
		}
		
		
	}

}
