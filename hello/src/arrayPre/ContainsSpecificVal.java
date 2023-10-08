package arrayPre;

public class ContainsSpecificVal {

	public static void main(String[] args) {
		int[] a = {4,1,2,3,9,8};
		int n=90;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==n)
			{
				flag = true;
			}
		}
		if(!flag)
		{
			System.out.println("Not Present");
		}
		else
			System.out.println("Present");
	}

}
