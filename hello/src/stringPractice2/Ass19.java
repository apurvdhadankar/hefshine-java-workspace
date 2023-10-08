package stringPractice2;

public class Ass19 {

	public static void main(String[] args) {
		String s = "abcdeeddeeff";

		int maxlen=0;
		int maxindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			int count=1;
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)== s.charAt(j))
				{
					count++;
				}
			}
			if(count>maxlen)
			{
				maxlen=count;
				maxindex=i;
			}
		}
		System.out.println("Max Number char Occur is "+ maxlen);
		System.out.println("Max char occur is "+ s.charAt(maxindex));

	}

}
