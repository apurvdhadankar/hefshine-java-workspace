package stringPre;

public class ReturnSumOfDigits {

	public static void main(String[] args) {
		String s = "1kaj2apjf3";
		int sum=0;
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=48 && c[i]<=57)
			{
				sum=sum+c[i]-48;
			}
		}
		System.out.println(sum);

	}

}
