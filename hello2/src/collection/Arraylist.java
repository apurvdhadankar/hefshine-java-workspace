package collection;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args){
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.addAll(colors);
		colors.add(3, "Black");
		System.out.println(colors);
		System.out.println(colors.size());
	}

}
