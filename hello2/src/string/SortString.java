package string;

public class SortString {

	public static void main(String[] args) {
		String s = "43521";
		char ca[] = s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j = 0; j < ca.length-1; j++) 
			{
				if(ca[i]<ca[j])
				{
					char p=ca[i];
					char q = ca[j];
					ca[i]=q;
					ca[j]=p;
					
				}
			}
		}
		for (int i = 0; i < ca.length; i++) {
			System.out.println(ca[i]);
			
		}
		s = new String(ca);
		System.out.println(ca);

	}

}
