
public class Q25LargestNumberInKSwaps {

	static String max;
	static void findMaxNum(char[] str, int k)
	{
		if(k==0)
			return;
		for (int i = 0; i < str.length; i++) 
		{
			for (int j = i+1; j < str.length; j++) 
			{
				if (str[i] < str[j])
			      {
				char temp = str[i];
				str[i]=str[j];
				str[j]=temp;
				// If current num is more
		        // than maximum so far
				if(String.valueOf(str).compareTo(max)>0)
				{
					max = String.valueOf(str);
				}
				// recurse of the other 
		        // k - 1 swaps
				findMaxNum(str, k-1);
				
				char c = str[i];
				str[i] = str[j];
				str[j] = c;
			      }
			}
		}
	}
	public static void main(String[] args) {
		String str = "1234567";
		int k=1;
		max = str;
		findMaxNum(str.toCharArray(), k);
		System.out.println(max);
		
		
		
		
	}

}
