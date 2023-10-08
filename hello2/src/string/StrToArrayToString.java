package string;

public class StrToArrayToString {

	public static void main(String[] args) 
	{
		
		String a = "Apurv Dhadanakr";
		char name[] = new char[a.length()];
		for(int i=0 ; i<name.length; i++)
		{
			name[i] = a.charAt(i);
			
			System.out.print(name[i]);
		}
		System.out.println();
		
//		Array To String
		String name2 = new String(name);
		System.out.print(name);

	}

}
