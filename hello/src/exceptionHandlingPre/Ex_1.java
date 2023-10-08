package exceptionHandlingPre;

public class Ex_1 {

	public static void main(String[] args)  {
		fun();
	}

	private static void fun() {
		morefun();
		System.out.println("Method Fun");
		
	}

	private static void morefun() {
		System.out.println(10 / 0);
		System.out.println("Method MoreFun");
		
	}

}
