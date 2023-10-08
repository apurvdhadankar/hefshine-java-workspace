package hello;

public class GradeOfFiveSubjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1=80, m2=90, m3=99, m4=99, m5=95;
		int total=m1+m2+m3+m4+m5;
		float percentage= total/5;
		System.out.println(percentage);
		if(percentage>=90)
			System.out.println("Grade A");
		else if(percentage>=80)		
			System.out.println("Grade B");
		else if(percentage>=70)
			System.out.println("Grade C");
		else if(percentage>=60)
			System.out.println("Grade D");
		else if(percentage>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
		
	}

}
