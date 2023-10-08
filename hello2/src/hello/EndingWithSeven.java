package hello;

public class EndingWithSeven {

	public static void main(String[] args) {
		int i=0;
		for(i=100; i<=200; i++) {
			for(int j=0; j<=100; j+=10) {
				if((i+j)%10==7) {
					System.out.println(i);
					break;
				}
				
			}
		}

	}

}
