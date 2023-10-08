package neova;

public class Main {
	
//	static boolean print(String s, String[] str)
//	{
//	System.out.println(s);
//	System.out.println();
//	for (int i = 0; i < str.length; i++) 
//	{
//		if(str[i].compareTo(s)==0)
//			return true;
//	}
//
//	return false;
//	}
//	
	static int presentOrNot(String s, String[] sa)
	{
		int cnt= 1;
		for (int i = 0; i < sa.length-1; i++) 
		{
			if(s.compareTo(sa[i])==0);
			{
				cnt++;	
			}
		}
		if(cnt>0)
			return cnt;
		else
			return 0;
	}
	
	
	static void cntString(String[] sa)
	{
		int cnt=1;
		for (int i = 0; i < sa.length; i++) 
		{
			 String[] sa1 =  sa[i].split(" ");
			for (int j = 0; j < sa1.length; j++) 
			{
				for (int k = i+1; k < sa1.length; k++)
				{
						if(sa1[k].equals(sa1[j]))
						{
							cnt++;
							sa1[k]="0";
							break;
						}
					
				}
				
			}
		}
		System.out.println(cnt);
		
	}
	
	
	public static void main(String[] args) {
		String s = "hello";
		String[] sa = {"hello hello hello","Java","hello", "hello"};
//		System.out.println(print(s, sa));
//		
//		System.out.println(presentOrNot(s, sa));
		cntString(sa);
		
		
		
		
	}

}
