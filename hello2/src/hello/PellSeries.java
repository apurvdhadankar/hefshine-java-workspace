package hello;

public class PellSeries {

	public static void main(String[] args) {
		int n, a=1, b=0,c;
		System.out.print("0 ");
		for ( n = 0; n < 10; n++) 
		{
			c = a+(2*b);
			System.out.print(c+" ");
			a=b;
//			System.out.println("a "+a);
			b=c;
//			System.out.println("b "+b);
		}
		

	}

}
