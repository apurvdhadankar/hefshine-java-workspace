package hello;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=1114;
		int temp=0;
		while(n!=0)
		{
			temp= temp+n%10;
			n=n/10;
		}
		System.out.println(temp);

	}

}
