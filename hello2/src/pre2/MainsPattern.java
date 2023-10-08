package pre2;

public class MainsPattern {

	

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) 
		{
			int cnt=1, cnt1=0;
			for (int j = 0; j < 5; j++) 
			{
				if(i+j>=4 && i%2==0)
				{
					System.out.print(facAdd(i)+cnt+" ");
					cnt++;
				}
				else if(i+j>=4 && i%2!=0)
				{
					System.out.print(facAdd(i+1)-cnt1+" ");
					cnt1++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static int facAdd(int i) {
		int sum=0;
		for (int j = 0; j <= i ; j++) 
		{
			sum=sum+j;
		}
		return sum;
		
	}

}
