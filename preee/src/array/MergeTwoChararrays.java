package array;

public class MergeTwoChararrays {

	public static void main(String[] args) {
		char[] c1 = {'a','b','d','e','f','g','h'};
		char[] c2 = {'w','x','y','z'};
		char[] c3 = new char[c1.length+c2.length];
		int len=0;
		int index=0;
		if(c1.length<c2.length)
		{
			len = c1.length;
			for (int i = 0; i < len; i++) 
			{
				c3[index++]=c1[i];
				c3[index++]=c2[i];
				
			}
			for (int i = len; i < c1.length; i++) 
			{
				c3[index++] = c2[i];
			}
		}
		else
		{
			len = c2.length;
			for (int i = 0; i < len; i++) 
			{
				c3[index++]=c1[i];
				c3[index++]=c2[i];
				
			}
			for (int i = len; i < c2.length; i++) 
			{
				c3[index++] = c1[i];
			}
		}
		System.out.println(c3);
		
		}
	}


