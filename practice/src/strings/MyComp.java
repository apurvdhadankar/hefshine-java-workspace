package strings;

import java.util.Comparator;

public class MyComp implements Comparator<MarksTable>{

	@Override
	public int compare(MarksTable x, MarksTable y) {
		if((x.c+x.angular+x.java+x.python) == (y.c+y.angular+y.java+y.python))
			return 0;
		else if((x.c+x.angular+x.java+x.python) < (y.c+y.angular+y.java+y.python))
			return -1;
		else
			return 1;
	}
	

}
