package array;

public class Leaders {
	public static void main(String[] args) {
		int[] a = {9,1,2,8,4,3,7,6};
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag=true;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			System.out.println("Leaders "+a[i]);
		}
	}

}
