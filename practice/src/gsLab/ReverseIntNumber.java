package gsLab;

public class ReverseIntNumber {

	public static void main(String[] args) {
		int n= 123;
		int sum=0, r;
		int temp = n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
		

	}

}
