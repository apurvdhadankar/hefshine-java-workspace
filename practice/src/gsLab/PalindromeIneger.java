package gsLab;

public class PalindromeIneger {

	public static void main(String[] args) {
		int n=1215,r,sum=0,temp;    
		
		temp=n;    
		while(n>0)    
		{    
		r=n%10;    
//		System.out.println(r);
		sum=(sum*10)+r; 
//		System.out.println(sum);
		n=n/10;    
		}    
			
		
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
