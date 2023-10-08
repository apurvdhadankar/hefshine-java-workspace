package mains;

public class 	FirstNonRepeatedElement 
{
	public static void main(String[] args) {
		int[] a = { 23, 45, 26, 73, 26,45, 23 };
		for(int i = 0;i<a.length;i++)
		{
			int cnt=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i] == a[j]) 
				{
					
					a[i]=0;
//					a[j]=0;
					break;
				}
			}
			if(a[i]!=0)
			{
				System.out.println(a[i]);
				break;
			}
			
		}
		int b=100;
		System.out.println(b++);
		System.out.println(b--);
		System.out.println(--b);

			
		
	}
	}

	
	

