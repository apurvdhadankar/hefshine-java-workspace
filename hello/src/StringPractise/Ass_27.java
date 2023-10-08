package StringPractise;

public class Ass_27 
{
	public static void main(String[] args) 
	{
		String s = "Welcomeeeeee tsdllkkjlkdjlsloooo Javaaa World";
		String[] ca = s.split(" ");
		int maxlen = 0;
		int maxi = 0;
		for (int i = 0; i < ca.length; i++)
		{
			int count = 0;
			for (int j = 0; j < ca[i].length(); j++)
			{
				for (int k = j+1; k < ca[i].length(); k++)
				{
					if (ca[i].charAt(j) == ca[i].charAt(k))
					{
						count++;
						break;
					}
				}
				
			}
			int scnt = ca[i].length()-count;
			if(maxlen < scnt)
			{
				maxlen = scnt;
				maxi = i;
			}
		}
		System.out.println("Length of the longest Substring : "+maxlen);
		System.out.println(maxi+"  "+ca[maxi]);	
		
	}

}
