
public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0, b=1, c=0;
		System.out.print(a);
		int i=1;
//		while(i<=8)
//		{
//			a=b;
//			b=c;
//			c=a+b;
//			if(c<=20) {
//				System.out.print(" "+c);
//			}
//			
//			i++;
//		}
		
		do
		{
			a=b;
			b=c;
			c=a+b;
			if(c<=20) {
				System.out.print(" "+c);
			}
			
			i++;
			
		}
		while(i<=10);

	}

}
