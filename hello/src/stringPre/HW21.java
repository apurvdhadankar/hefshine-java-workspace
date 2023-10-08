package stringPre;

public class HW21 {

	public static void main(String[] args) {
		String s = "abcd abcdeee abcdeeeeeeee abcde";
		String sa[] = s.split(" ");
		int maxlen = 0;
		int maxindex = 0;
		for (int i = 0; i < sa.length; i++) 
		{
			int rep=0;
			int unilen=0;
			for (int j = 0; j < sa[i].length(); j++) 
			{
				for (int k = j+1; k < sa[i].length(); k++) 
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
				maxindex = i;
			}
		}
		System.out.println("Max Substring Witouth Repeatating Charactrs is "+maxlen);
		System.out.println("Index is "+sa[maxindex]);
	}
}
