
public class ReverseNo {

	public static void main(String[] args) {
		int n=1234, temp=0;
		while(n!=0) {
			temp = n%10;
			n/=10;
			System.out.print(temp);
		}
//		System.out.println(temp);

	}

}
