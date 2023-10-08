package pre2;

public class Q6 {

	public static void main(String[] args) {
		String s = "aaaabbbccd";
		int count=1;
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
		System.out.println(count);
		char[] uni = new char[s.length()-count];
		int unidex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
			for (int j = 0; j < uni.length; j++) 
			{
				if(s.charAt(i)==uni[j])
				{
					count++;
					
				}
			}
			if(count==0)
			{
				uni[unidex++] = s.charAt(i);
				unidex++;
			}
		}
		for (int i = 0; i < uni.length; i++) 
		{
			System.out.print(uni[i]+" ");
		}

	}

}
