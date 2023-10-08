
public class NoOfDigits {
	public static void main(String[] args) {
		int n=1589;
		int t=n;
		int cnt=0;
		while(n!=0) {
			n=n/10; 
			cnt++;
		}
		System.out.println(cnt);
	}

}
