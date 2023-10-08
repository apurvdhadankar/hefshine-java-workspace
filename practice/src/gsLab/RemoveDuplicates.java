package gsLab;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,51,2,3,4,5,22,55,66,99,8+8,77,11,56,5,};
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
		int[] b = new int[a.length-cnt];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
					cnt++;
			}
			if(cnt==0)
				b[index++] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}

}
