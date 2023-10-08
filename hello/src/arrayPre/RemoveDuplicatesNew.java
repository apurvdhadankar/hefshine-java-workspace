package arrayPre;

public class RemoveDuplicatesNew {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,8,1,5,6,9,1,2,3};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		int b[] = new int[a.length-count];
		int inx=0;
		for (int i = 0; i < a.length; i++) 
		{
			count=0;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
					count++;
			}
			if(count==0)
			{
				b[inx++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
