package stringPre;

public class HW25 {

	public static void main(String[] args) {
		String s = "aabbbcccdddeeffkkk";
		int min = Integer.MAX_VALUE, index=0;
		int count =0;
		for (int i = 0; i < s.length(); i++) 
		{
			
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		int unilen=s.length()-count;
//		System.out.println(unilen);
		char ca[] = new char[unilen];
		int ia[] = new int[unilen];
		int caindex=0;
		for (int i = 0; i < ca.length; i++) 
		{
			char p=s.charAt(i);
			for (int j = 0; j < s.length(); j++) 
			{
				if(ca[i]==p)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				ca[index++]=p;
			}
		}
		for (int i = 0; i < ia.length; i++) 
		{
			count=0;
			char q=ca[i];
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==q)
				{
					count++;
				}
			}
			if(count!=0)
			{
				ia[i]=count;
			}
			
		}
		for (int i = 0; i < ia.length; i++)
		{
			for (int j = i+1; j < ia.length; j++) 
			{
				
					int p=ia[i];
					int q=ia[j];
					ia[i]=q;
					ia[j]=p;
					
					char x=ca[i];
					char y=ca[j];
					ca[i]=y;
					ca[j]=x;
				
			}
		}
		for (int i = 0; i < ia.length; i++) {
			System.out.print(ia[i]+" ");
			System.out.println(ca[i]+" ");
		}
		System.out.println("Lowest Frequency is "+ca[0]);
		
	}

}
