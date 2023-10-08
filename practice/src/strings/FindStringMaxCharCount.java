package strings;

public class FindStringMaxCharCount {

	public static void main(String[] args) {
		String s = "hello assessment is given";
		String[] sa = s.split(" ");
		int max = Integer.MIN_VALUE;
		int count=0;
		String newS="";
		char c='0';
		for (int i = 0; i < sa.length; i++) 
		{
			count=0;
			for (int j = 0; j < sa[i].length(); j++) 
			{
				for (int k = j+1; k < sa[i].length(); k++) 
				{
					if(sa[i].charAt(j)==sa[i].charAt(k))
					{
						count++;
						c=sa[i].charAt(j);
						break;
					}
				}
				if(count>max)
				{
					max=count;
					newS = sa[i];
				}
			}
		}
		System.out.println(max+" "+newS+" Max Char is : "+c);

	}

}
