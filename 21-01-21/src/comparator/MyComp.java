package comparator;

import java.util.Comparator;

public class MyComp implements Comparator<Emp>{

	public int compare(Emp x, Emp y) 
	{
		if(x.sal == y.sal)
		{
			return x.name.compareToIgnoreCase(y.name);
		}
		if(x.sal==y.sal)
		{
			return x.age.compareTo(y.age);
		}
		else if(x.sal > y.sal)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
	}

}
