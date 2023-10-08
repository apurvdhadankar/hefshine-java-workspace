
public class NotReverseSpclChar {

	public static void main(String[] args) {
		char[] c = {'a','b','d','c','!'};
		int count=0;
		int si=0, ei=0;
		for (int k = 0; k < c.length; k++)
		{
		for (int i = 0; i < c.length; i++) 
		{
			
			if(c[i]>=97 && c[i]<=122)
			{
				si=i;
				break;	
			}
		}
		for (int i = c.length-1; i >= 0; i--) 
		{
			
			if(c[i]>=97 && c[i]<=122)
			{
				ei=i;
				break;			
			}
		}
			
			char temp = c[si];
			c[si] = c[ei];
			c[ei] = temp;
			
		}
		System.out.println(c);
		
		
		}
	}


