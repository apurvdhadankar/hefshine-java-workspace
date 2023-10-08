package cntrlStmt;

public class PrintEndWithSeven {

	public static void main(String[] args) {
	for (int i = 0; i < 100; i++) 
	{
		boolean flag=false;
		String s = String.valueOf(i);
		for (int j = 0; j < s.length(); j++) 
		{
			if(s.charAt(j)=='3')
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println(s);
		}
	}
	}

}
