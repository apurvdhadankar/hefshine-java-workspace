package string;

public class ReverseEverWord {

	public static void main(String[] args) {
		String s = "Gian Aquaman Sunio Doremon Ambulance";		
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		String[] sa = new String[count+1];
		int si=0, ei=0, sai=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ' || i==s.length()-1)
			{
				ei=i;
				if(s.charAt(i)==' ')
				{
					ei=i-1;
				}
				char[] c = new char[ei-si+1];
				int cindex=0;
				for (int j = si; j <= ei; j++) 
				{
					c[cindex]=s.charAt(j);
					cindex++;
				}
				for (int j = 0; j < c.length/2; j++) 
				{
					char temp = c[j];
					c[j]=c[c.length-1-j];
					c[c.length-1-j]=temp;
				}
				String m = new String(c);
				sa[sai]=m;
				sai++;
				si=ei+2;
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
		
		
		/*
		String sa[] = s.split(" ");
		String[] sa1 = new String[sa.length];
		int sa1index=0;
		for (int i = 0; i < sa.length; i++) 
		{
			char[] c = new char[sa[i].length()];
			char[] cc1 = sa[i].toCharArray();
			int index=0;
			for (int j = 0; j < cc1.length; j++) 
			{
				c[index++]=cc1[i];
			}
			for (int k = 0; k < c.length/2; k++) 
			{	
				char temp = c[k];
				c[k] = c[c.length-1-k];
				c[c.length-1-k] = temp;
			}
			String m = new String(c);
			sa1[sa1index++]=m;	
		}
		for (int i = 0; i < sa1.length; i++) 
		{
			System.out.print(sa1[i]+" ");
		}

		 */

	}

}
