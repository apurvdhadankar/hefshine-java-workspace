package neova;

public class Anagram {

	public static void main(String[] args) {
		char[] c1 = ("apurv").toCharArray();
		char[] c2 = ("vapur").toCharArray();
		if(c1.length!=c2.length)
		{
			System.out.println("not anagram");
		}
		else
		{
			boolean flag = true;
			for (int i = 0; i < c1.length; i++) 
			{
				for (int j = 0; j < c2.length; j++) 
				{
					if(c1[i]!=c2[j])
					{
						flag= false;
					}
					else
					{
						flag= true;
						break;
					}
				}
			}
			if(flag==true)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
		
		create table apurv(id int, name varchar(20), lname varchar(10))
	}

}
