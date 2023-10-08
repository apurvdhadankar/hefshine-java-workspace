package stringPreeeee;

public class OnlyDigits_HW_16 {

	public static void main(String[] args) {
		String s = "abcddjlksdg";
		int sum=0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=48 && c[i]<=56)
			{
				sum = sum+c[i]-48;
			}
		}
		System.out.println(sum);

	}

}
