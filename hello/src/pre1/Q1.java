package pre1;

public class Q1 {

	public static void main(String[] args) {
		String s = "  aaa  bbbb          cccc dhskjsd h iusdhf           ";
		char ca[] = s.toCharArray();
		int si = 0, ei=0;
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i] !=' ')
			{
				si=i;
				break;
			}
		}
		for (int i = ca.length-1; i > 0; i--) 
		{
			if(ca[i] != ' ')
			{
				ei=i;
				break;
			}
		}
		char b[] = new char[(ei-si)+1];
		int index=0;
		for (int i = si; i <= ei; i++) 
		{
			b[index]=ca[i];
			index++;
		}
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.print(b[i]);
//		}	
		//for inner spaces
		int count=0;
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i]==' ' && b[i+1]==' ')
				count++;
		}
		char ba[] = new char[b.length-count];
		index=0;
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i]==' '&& b[i+1]==' ')
			{}
			else
			{
				ba[index]=b[i];
				index++;
			}
		}
		s = new String(ba);
		System.out.println(ba);
		

	}

}
