package gsLab;


	 interface Topic{
		void understand();
	}
	class Topic1 implements Topic
	{

		public void understand() {
			System.out.println("Got it");
			
		}
	}
	class Topic2 implements Topic
	{

		public void understand() {
			System.out.println("Understand");
		}
	}
		
	
	public class LooseCoupling {
	public static void main(String[] args) {
		Topic obj = new Topic1();
		obj.understand();

	}

	}
