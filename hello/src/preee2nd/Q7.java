package preee2nd;

public class Q7 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("nitin");
		StringBuffer s2 = new StringBuffer("mam");
		StringBuffer s3 = new StringBuffer("madam");
		StringBuffer s4 = new StringBuffer("kajak");
		StringBuffer s5 = new StringBuffer("kasak");
		StringBuffer s6 = new StringBuffer("wow");
		StringBuffer[] a = {s1,s2,s3,s4,s5,s6};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i].length() > a[j].length())
				{
					StringBuffer temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		boolean flag=true;
		for (int i = 0; i < a.length; i++) 
		{
			StringBuffer temp = a[i];
			for (int j = 0; j < temp.length(); j++) 
			{
				if(temp.charAt(j) != temp.charAt(temp.length()-j-1))
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
