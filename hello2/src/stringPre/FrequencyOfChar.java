package stringPre;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String s = "aabcdefgbaf";
		int count=0;
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
		char cc[] = new char[s.length()-count];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			boolean flag=false;
			for (int j = 0; j < cc.length; j++) 
			{
				if(s.charAt(i)==cc[j])
				{
					flag=true;
				}
			}
			if(!flag)
			{
				cc[index]=s.charAt(i);
				index++;
			}
			
		}
		for (int i = 0; i < cc.length; i++) 
		{
			int count1=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(cc[i]==s.charAt(j))
				{
					count1++;
				}
			}
			System.out.println(cc[i]+" "+count1);
		}

	}

}
