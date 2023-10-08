package hello;

public class HarshadNo {

	public static void main(String[] args) {
		int n  =22;
		int temp1=n;
		int temp=0;
		while(n!=0) {
			temp =  temp + n%10;
			n=n/10;
		}
		System.out.println(temp);
		if((temp1%temp)==0)
		{
			System.out.println("Harshad No");
		}
		else
		{
			System.out.println("Not Harshad");
		}
		
		
	}

}
