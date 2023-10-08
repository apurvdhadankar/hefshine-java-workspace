package stringPre2;

public class FrequencyChar {

	public static void main(String[] args) {
		String s = "aaaabbbbcc";
		int count=0;
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			count=1;
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]==c[j])
				{
					c[j]=0;
					count++;
				}
			}
			
			if(c[i]!=0)
				System.out.println(c[i]+" "+count);
		}
		
		

	}

}
