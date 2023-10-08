package arrayAttempt2;

public class LeaderAss15 {

	public static void main(String[] args) {
		int[] a= {9,1,5,8,1,2,4};
		
		for (int i = 0; i < a.length; i++) 
		{
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
				System.out.println(a[i]);
		}
	

	}

}
