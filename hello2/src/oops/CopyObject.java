package oops;

import java.util.Scanner;

public class CopyObject {
int a,b;
void copyObject(CopyObject ob3) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Two Numbers ");
	a=sc.nextInt();
	b=sc.nextInt();
	}
public CopyObject(int x) {
	a=x;
}
public CopyObject(CopyObject ob) {
	a=ob.a;
	b=ob.b;
}
//void copyObject(CopyObject ob1) {
//	a=ob1.a;
//	System.out.println(a);
//}
void dispaly() {
	System.out.println("a="+a+" b="+b);
}
	public static void main(String[] args) {
		CopyObject c1 = new CopyObject(10);
		CopyObject c2 = new CopyObject(c1);
		c2.copyObject(c2);
		c2.dispaly();
		
		

	}

}
