package coparator;

import java.util.Comparator;

public class Mycomp implements Comparator<Emp> {

	public int compare(Emp x, Emp y) {
		if(x.sal == y.sal)
		{
			return x.name.compareToIgnoreCase(y.name);
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
