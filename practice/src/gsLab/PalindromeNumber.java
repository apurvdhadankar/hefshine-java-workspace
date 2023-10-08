package gsLab;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n = 123321;
		int sum=0, r, temp =n;
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palidrome");

	}

}
