package string;

public class CountPrintDuplicates {

	public static void main(String[] args) {
		String s = "abacccddad";
		int count =0;
		for (int i = 0; i < s.length(); i++) 
		{
			
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					System.out.println(s.charAt(j));
					break;
				}
			}
		}
		System.out.println(count);

	}

}
