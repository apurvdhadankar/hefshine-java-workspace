package test1;

public class Third {

	public static void main(String[] args) {
		String s = "43521";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=(char) temp;
				}
			}
		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.print(a[i]);
//		}
		s = new String(a);
		System.out.println(a);

	}

}
