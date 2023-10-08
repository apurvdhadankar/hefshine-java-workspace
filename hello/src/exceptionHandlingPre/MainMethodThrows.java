package exceptionHandlingPre;

public class MainMethodThrows {

	void testingException() {
		try {
			MainMethodThrows.main(new String[] {});
		}
		catch(Throwable e)
		{
			assertTrue( e instanceof RuntimeException);
		}
	}
	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		dangerousMethod();
		unreachableMethod();

	}
	private static void dangerousMethod() {
		throw new RuntimeException();
		
	}
	private static void unreachableMethod() {
		System.out.println("Won't Execute");
		
	}

}
