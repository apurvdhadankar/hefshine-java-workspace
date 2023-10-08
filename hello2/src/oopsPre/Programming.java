package oopsPre;

public class Programming {
	public Programming(String s) 
	{
		if(s != "")
		{
			System.out.println("I want to learn "+s);
		}
		else
		{
			s = "I want to learn language";
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Programming p = new Programming("Kajuuu");

	}

}
