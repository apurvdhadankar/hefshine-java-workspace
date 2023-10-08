package pract;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String s = "1111";
		char[] c = s.toCharArray();
		int sum=0;
		int a=1;
		for (int i = c.length-1; i >= 0; i--) 
		{
			int b=c[i]-48;
			sum = sum+(b*a);
			a=a*2;
		}
		System.out.println(sum);
		
	}

}
