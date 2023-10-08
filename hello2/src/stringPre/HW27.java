package stringPre;

public class HW27 {

	public static void main(String[] args) {
		String s = "ApURV";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=65 && c[i]<97)
			{
				c[i]=(char) (c[i]+32);
			}
		}
		s = new String(c);
		System.out.println(s);
		

	}

}
