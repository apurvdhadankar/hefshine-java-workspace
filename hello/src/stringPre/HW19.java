package stringPre;

public class HW19 {

	public static void main(String[] args) {
		String s = "apurv dhadankar";
		int maxlen=0, maxindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			int count=1;
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;	
				}
				if(count>maxlen)
				{
					maxlen=count;
					maxindex=i;
				}
			}
		}
		System.out.println("Max Occurennce is "+maxlen);
		System.out.println("Element is "+s.charAt(maxindex));

		

	}

}
