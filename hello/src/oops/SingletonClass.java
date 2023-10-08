package oops;

public class SingletonClass {

	public static void main(String[] args) {
		CreatingSingletonCalss s1 = CreatingSingletonCalss.getStudent();
		CreatingSingletonCalss s2 = CreatingSingletonCalss.getStudent();
		CreatingSingletonCalss s3 = CreatingSingletonCalss.getStudent();
		s1.rn=1;
		s2.rn=2;
		s3.rn=3;
		System.out.println(s1.rn);
		System.out.println(s2.rn);
		System.out.println(s3.rn);
		
	}

}
