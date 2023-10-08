package string;

public class MaxSubStringWithUniqueChars2 {

	public static void main(String[] args) {
		String s = "abcdefa abcdeb abcdfeeeeeeee abccccdef";
		int maxlen=0;
		int maxind = 0;
		String sa[] = s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			int rep=0;
			int unilen=0;
			for (int j = 0; j < sa[i].length(); j++)
			{
				for (int k = j+1; k > sa[i].length(); k++) 
				{
					if(sa[i].charAt(j)==sa[i].charAt(k))
					{
						rep++;
					}
				}
			}
			unilen=sa[i].length()-rep;
			if(unilen>maxlen)
			{
				maxlen=unilen;
				maxind=i;
			}
		}
		System.out.println("Max length is "+maxlen+" index is "+sa[maxind]+"maxindex is "+maxind);
		
		

	}

}
