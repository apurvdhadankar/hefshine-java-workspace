package hello;

public class KaprekarNumber {

	public static void main(String[] args) {
		int a =45;
		int b = a*a;
		int temp=b;
		int d=0;
		while(temp > 0)
		{
			temp=temp/10;
			d++;
		}
		System.out.println(d);
		if(d%2!=0) 
		{		
			d++;
		}
		int sep = (int) Math.pow(10, d/2);
		System.out.println(sep);
		int n1 = b/sep;
		int n2 = b%sep;
		System.out.println(n1+" "+n2);
		if((n1+n2)==a)
		{
			System.out.println("Kaprekar");
		}
		else
		{
			System.out.println("Not");
		}
			
		

	}

}
