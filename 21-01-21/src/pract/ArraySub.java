package pract;

public class ArraySub {

	public static void main(String[] args) {
	int[] a = {1,2,3};
	int[] b = {4,5,6};
	int sub=0;
	String s="";
	String p="";
	for (int i=0; i<a.length ; i++) 
	{
		
		s = s+a[i];
		p = p+b[i];
	}
	
	System.out.println(s);
	System.out.println(p);
	int x = Integer.parseInt(s);
	int y = Integer.parseInt(p);
	System.out.println(x-y);
	
	

	}

}
