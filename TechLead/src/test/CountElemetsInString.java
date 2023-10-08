package test;

public class CountElemetsInString {

	public static void main(String[] args) {
		String sa[] = {"hello hello hello hello", "world", "hello"};
		String s = "hello";
		for (int i = 0; i < sa.length; i++) 
		{
			int count=0;
			String sa1[] = sa[i].split(" ");
			for (int j = 0; j < sa1.length; j++) 
			{
				if(sa1[j].equals(s))
				{
					count++;
				}
			}
			System.out.println(count);
		}
		

	}

}
