package test;

public class Q6 {

	public static void main(String[] args) {
		String s = "madam";
		String s1 = "";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				s1="";
				for (int k = i; k <= j; k++) 
				{
					s1 = s1+s.charAt(k);
				}
				StringBuffer sb = new StringBuffer(s1);
				if(sb.reverse().toString().equals(s1))
				{
					if(s1.length()!=1)
					{
						System.out.println(s1);
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
