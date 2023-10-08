package array;

public class MostFrequntElement {

	public static void main(String[] args) {
		int a[] = {1,1,1,2,2};
		int cnt=1;
		int element=0;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			cnt=1;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					a[j]='`';
					cnt++;
					
				}
			}
			if(a[i]!='`' && max<cnt)
			{
//				if(max<cnt)
//				{
					max=cnt;
					element=a[i];
//				}
			}
		}
		System.out.println(element);
				

	}

}
