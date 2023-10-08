package patterns;

public class ArrowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=6; i++) {
			
			for(int j=0; j<=6; j++) {
				if(j-i<=0 && i+j<=6) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
