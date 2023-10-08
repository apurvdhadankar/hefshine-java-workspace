package prrree;

public class Q6_UpperToLower {

	public static void main(String[] args) {
		String s1 = "abCd";
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) 
		{
			if(c1[i] >= 'A' && c1[i]<= 'Z')
			{
				c1[i] = (char) (c1[i]+32);
			}
			else if(c1[i] >= 'a' && c1[i] <= 'z')
			{
				c1[i] = (char) (c1[i]-32);
			}
		}
		System.out.println(c1);
		
	}

}
