package gsLab;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		int n = 1234;
		int temp=n;
		while(temp!=0)
		{
			System.out.print(temp%10);
			temp = temp/10;
			
		}
		

	}

}
