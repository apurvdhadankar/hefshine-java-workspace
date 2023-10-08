
public class PowerOfNumber {

	public static void main(String[] args) {
		int base=2, power=3;
		int result=1;
//		for(int i=1; i<=power; i++)
//		{
//			result = base*result;
//		}
//		System.out.println(result);
		
//		By using While Loop
		int i=1;
		while(i<=power) {
			result *= base;
			i++;
		}
		System.out.println(result);

	}

}
