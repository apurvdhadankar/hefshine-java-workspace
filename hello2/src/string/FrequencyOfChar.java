package string;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String s = "aaaaabcedffsa";
//		char c=0;
		int freq=0;
		char c=' ';
		int count;
		for (int i = 0; i < s.length(); i++) 
		{
			 count=1;
				for (int k = i+1; k < s.length(); k++) 
				{
					if(s.charAt(i)==s.charAt(k))
					{
						count++;
						break;
					}
				}
				freq=count;
				 c=s.charAt(i);
			
			
		}
		System.out.println("Frequence of "+c+" "+freq);
		
		

	}

}
