package neova;

public class DuplicateStringElements {

	public static void main(String[] args) {
		String[] sa = {"hello hello hello", "hii    hello", "hello","hello"};
		String s = "hello";
		int cnt=0;
		for (int i = 0; i < sa.length; i++) 
		{
			String[] sa1 = sa[i].split(" ");
				for (int k = 0; k < sa1.length; k++) 
				{
					if(s.equals(sa1[k]))
					{
						cnt++;
//						sa1[k]="0";
					}
				}
		}
		
		System.out.println(cnt);

	}

}
