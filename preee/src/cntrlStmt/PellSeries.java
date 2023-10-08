package cntrlStmt;

public class PellSeries {

	public static void main(String[] args) {
		int a=1, b=0, c=0;
		System.out.print("0");
		for (int i = 0; i < 10; i++) 
		{
			c=(2*b)+a;
			a=b;
			b=c;
			

			System.out.print(" "+c);
			
		}
	}

}
