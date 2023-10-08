
public class PrimeOrNot {


	public static void main(String[] args) {
		int n=15;
		boolean flag=false;
		for(int i=2; i<n; i++)
		{
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==true)
			System.out.println(n + " is Not Prime");
		else
			System.out.println(n + " is Prime");

	}

}
