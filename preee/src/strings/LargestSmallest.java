package strings;

public class LargestSmallest {

	public static void main(String[] args) {
		String s = "aaa bbbb ccccc";
		String[] sa = s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].length() > sa[j].length())
				{
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}
//		for (int i = 0; i < sa.length; i++) {
//			System.out.println(sa[i]);
//		}
		System.out.println("Samllest ->"+sa[0]);
		System.out.println("Largest ->"+sa[sa.length-1]);
	}

}
