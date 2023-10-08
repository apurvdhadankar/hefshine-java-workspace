package hello;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=10000;
		double r = 0.08;
		int n=2;
		int t=3;
		double a = p*(Math.pow((1+(r/n)), (n*t)));
		System.out.println("Compound Intrest is "+ a);

	}

}
