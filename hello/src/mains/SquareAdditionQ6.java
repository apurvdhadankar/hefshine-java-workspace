package mains;

public class SquareAdditionQ6 {

	public static void main(String[] args) {
		String s = "a5bc12pqr";
		int sum=0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>'0'&& c[i]<='9')
			{
				int s1 = c[i]-48;
				sum = sum+((s1)*(s1));
			}
		}
		System.out.println(sum);
	}

}
