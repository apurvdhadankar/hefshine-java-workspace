package string;

public class RemoveCharUsingArray {

	public static void main(String[] args) {
		String str = "acbcdece";
		char a[] = str.toCharArray();
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]=='c')
			{
				count++;
				for (int j = i; j < a.length-1; j++) 
				{
					a[j]=a[j+1];
				}
			}
		}
		System.out.println(count);
		for (int i = 0; i < a.length-count; i++) 
		{
			System.out.print(a[i]);
		}

	}

}
