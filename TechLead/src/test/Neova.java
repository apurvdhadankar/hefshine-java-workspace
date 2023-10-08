package test;

public class Neova {

	public static void main(String[] args) {
		String s = "helloapurvhellohellodhadankar";
		int si=0, ei=0;
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='h')
				si = i;
			if(s.charAt(i)=='o')
				ei=i;
			
			if((ei-si)+1 == 5)
			{
				char[] sa = new char[ei-si+1];
				int index=0;
				for (int j = si; j <= ei; j++) 
				{
					sa[index++] = s.charAt(j);
				}
				String snew = new String(sa);
				
				if(snew.equals("hello"))
					count++;
			}
		}
		
		System.out.println(count);
	}

}
