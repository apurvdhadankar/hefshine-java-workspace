package gsLab;

public class LongestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {
		String s = "sddkjdfvjkdjfhfvuidffhv";
//		String s = "abcab";
		char[] ca = s.toCharArray();
		int imax=0, jmax=0;
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j = i+1; j < ca.length; j++) 
			{
				char c = ca[j];
				int cnt=0;
				for (int k = i; k < j; k++) 
				{
					if(ca[k]==c)
					{
						cnt++;
					}
				}
				if(cnt>0)
				{
//					for (int k = i; k < j; k++) 
//					{
//						System.out.print(ca[k]);
//					}
//					System.out.println();
					if((jmax-imax)<(j-i))
					{
						imax=i;
						jmax=j;
					}
					break;
				}
				
			}
		}
		System.out.println(jmax-imax);
		for (int i = imax; i < jmax; i++) 
		{
			System.out.print(ca[i]);
		}
	}

}
