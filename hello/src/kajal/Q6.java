package kajal;

public class Q6 {

	public static void main(String[] args) {
		int p =22000, n=2;
		int t=1;
		double rate = 0.08;
		double ci = Math.pow(1 +(rate*n), (n*t));
		System.out.println("Compound Intrest is "+ ci);
		
	}

}
