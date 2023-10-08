package hello;

public class PrintPinkYellow {

	public static void main(String[] args) {
		int count =0;
		int cnt1=0;
		int cnt2=0;
		for(int i=33; i<=999; i++) 
		{
			if(i%3==0 && i%5==0)
			{	count++;
				System.out.println(i+ " PINK&YELLOW ");
				
			}
			else if(i%3==0)
			{
				
				cnt1++;
				System.out.println(i+ " PINK ");
				
			}
			else if(i%5==0)
			{
				
				cnt2++;
				System.out.println(i+ " YELLOW ");
			}
		}
		System.out.println("YELLOW&PINK IS "+count+"\nPINK IS "+cnt1+"\nYELLOW IS "+cnt2);
		System.out.println(count+cnt1+cnt2);

	}

}
