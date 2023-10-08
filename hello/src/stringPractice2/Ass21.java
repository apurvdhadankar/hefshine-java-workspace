package stringPractice2;

public class Ass21 {

	public static void main(String[] args) {
		String s = "abcd abcdef abcddeef abcdr";
		String sa[] = s.split(" ");
		int count=0;
		int maxlen=0, maxi=0;
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = 0; j < sa[i].length(); j++) 
			{
				for (int k = j+1; k < sa[i].length(); k++) 
				{
					if(sa[i].charAt(j)==sa[i].charAt(k))
					{
						count++;
						break;
					}
				}
			}
			int scnt = sa[i].length()-count;
			if(maxlen < scnt)
			{
				maxlen = scnt;
				maxi = i;
			}
		}
		System.out.println("Length of the longest Substring : "+maxlen);
		System.out.println(maxi+"  "+sa[maxi]);	
		
		

	}

}
