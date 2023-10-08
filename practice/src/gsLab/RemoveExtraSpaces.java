package gsLab;

import java.util.ArrayList;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		String s = "    aaa bbbb     cccc    dddd    ";
		int si=0, ei=0;

		for (int i = 0; i < s.length(); i++) 
		{
			
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		for(int i = s.length()-1; i>=0; i--)
		{
			
			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		
		char[] c = new char[ei-si+1];
		int index=0;
		for (int i = si; i <= ei; i++) 
		{
			c[index++] = s.charAt(i);
		}
		index=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ' && c[i+1]==' ')
				index++;
		}
		char[] ca = new char[c.length-index];
		index=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ' && c[i+1]==' ')
			{}
			else
				ca[index++] = c[i];
		}
		System.out.println(ca);
	}

}
