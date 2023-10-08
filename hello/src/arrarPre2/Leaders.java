package arrarPre2;

public class Leaders {

	public static void main(String[] args) {
		int[] a  = {9,1,8,6,3,2,7};
		int leader=0;
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					flag=false;
					break;
					
				}
			}
			if(flag)
			{
				
				System.out.println(a[i]);
			}
			
		}

	}

}
