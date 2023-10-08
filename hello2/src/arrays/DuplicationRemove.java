package arrays;

public class DuplicationRemove {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,4,5,6,9,9};
		
//		int b[] = new int[cnt];
		int cnt=0;
		for(int i=0; i<a.length-1; i++)
		{
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
					cnt++;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n Count - "+cnt);
		int k=0;
		int temp[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				temp[k] = a[i];
				k++;
			}
		}
		
		for(int i=0; i<temp.length-cnt; i++)
		{
			System.out.print(temp[i]+" ");
		}
		
	}
}
		

		
	


