package arrays;

public class Replace0With1 {

	public static void main(String[] args) {
		int a[] = {0,1,0,1,0,1,0,1};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
				a[i]=1;
			else
				a[i]=0;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
