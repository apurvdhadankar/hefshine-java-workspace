package cntrlStmnt2;

public class Kaprekar {

	public static void main(String[] args) {
		int n=45;
		int a = n*n;
		int temp=a;
		int d=0;
		while(temp!=0)
		{
			temp = temp/10;
			d++;
		}
		System.out.println(d);
		if(d%2!=0)
		{
			d++;
		}
		int sep = (int) Math.pow(10, d/2);
		int x = a/sep;
		int y = a%sep;
		System.out.println(x+" "+y);
		if((x+y)==n)
		{
			System.out.println("Kaprekar");
		}
		else
			System.out.println("Not Kaprrkar");
		

	}

}
