package string;

public class ReverseEveryWord {

	public static void main(String[] args) {
		String s = "Andhaa Kaanun hain...!";
		char sa[] = s.toCharArray();
		for (int i = 0; i < sa.length/2; i++) 
		{
			char p = sa[i];
			char q = sa[sa.length-1-i];
			sa[i]=q;
			sa[sa.length-1-i]=p;
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]);
		}
//		String sa[] = s.split(" ");
//		for (int i = 0; i < sa.length; i++) 
//		{
//			char[] temp = sa[i].toCharArray();
//			for (int j = 0; j < temp.length/2; j++) 
//			{
//				char p = temp[i];
//				temp[i]= temp[temp.length-1-i];
//				temp[temp.length-1-i]=p;
//			}
//			
//		}
//		for (int i = 0; i < sa.length; i++) 
//		{
//			System.out.print(sa[i]+" ");
//		}

	}

}
