package preee2nd;

public class KaprekarQ2 {

	public static void main(String[] args) {
		int n = 9;
		int temp = n*n;
		int ori=temp;
		int d=0;
		while(temp!=0)
		{
			temp = temp/10;
			d++;
		}
//		System.out.println(d);
		if(d%2!=0)
		{
			d++;
		}
		int sep = (int) Math.pow(10, d/2);
		int a = ori/sep;
		int b = ori%sep;
		System.out.println(a+" "+b);
		if((a+b)==n)
		{
			System.out.println("kaprekar");
		}
		else
		{
			System.out.println("Not Kaprekar");
		}

	}

}
