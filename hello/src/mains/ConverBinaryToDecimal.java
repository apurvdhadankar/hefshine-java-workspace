package mains;

public class ConverBinaryToDecimal {

	public static void main(String[] args) {
		String s = "1111";
		char[] ca = s.toCharArray();
		int sum = 0;
		int a=1;
		for (int i = ca.length-1; i >= 0; i--) 
		{
			int b=ca[i]-48;
			sum=sum+(b*a);
			System.out.println(sum);
			a=a*2;
			System.out.println(a);
		}
		System.out.println(sum);
	}

}
