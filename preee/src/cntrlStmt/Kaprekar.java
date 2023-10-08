package cntrlStmt;

public class Kaprekar {

	public static void main(String[] args) {
		int n=45;
		int temp=n*n;
		int k=temp;
		int d=0;
		while(temp>0)
		{
			temp=temp/10;
			d++;
		}
//		System.out.println(d);
		if(d%2!=0)
		{
			d++;
		}
		int sep = (int) Math.pow(10, d/2);
//		System.out.println(sep);
		int a = k/sep;
		int b = k%sep;
		System.out.println(a+" "+b);
		if((a+b)==n)
		{
			System.out.println("Kaprekar");
		}
		else
		{
			System.out.println("Not Kapreakr");
		}
		
		

	}

}
