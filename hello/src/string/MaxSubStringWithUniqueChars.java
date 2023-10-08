package string;

public class MaxSubStringWithUniqueChars {

	public static void main(String[] args) {
		String s = "abcd abcdaa abcdeeeeeeee abcde";
		String[] sa = s.split(" ");
		int maxlen = 0;
		int maxindex = 0;
		for(int i=0 ;i<sa.length; i++)
		{
			int unilen=0;
			int rep=0;
			for (int j = 0; j < sa[i].length(); j++) 
			{
				for (int k = j+1; k < sa[i].length(); k++) 
				{
					if(sa[i].charAt(j) == sa[i].charAt(k))
					{
						rep++;
						break;
					}
				}
			}
			unilen = sa[i].length()-rep;
//			System.out.println(rep);
//			System.out.println(unilen);
			if(unilen>maxlen)
			{
				maxlen=unilen;
				maxindex=i;
			}
		}
		System.out.println(maxlen+" "+sa[maxindex]);

	}

}
