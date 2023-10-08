
package hello;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		1*2*3*4*5
		int mul=1;
		for(int i=1; i<=n; i++) {
			mul *= i;
		}
		System.out.println(mul);
		
		for(int i=n; i>1; i--) {
			mul *=i;
			System.out.println(mul);
		}
//		System.out.println(mul);

	}

}
