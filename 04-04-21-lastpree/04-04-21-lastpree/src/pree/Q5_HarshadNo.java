package pree;

public class Q5_HarshadNo {

	public static void main(String[] args) {
		int harshad = 12;
		int temp = harshad;
		int sum = 0;
		while(temp!=0)
		{
			int res = temp%10;
			sum = sum + res;
			temp = temp/10;
		}
		System.out.println(sum);
		if(harshad%sum==0)
		{
			System.out.println("Harshad No");
		}
		else
		{
			System.out.println("Not");
		}

	}

}
