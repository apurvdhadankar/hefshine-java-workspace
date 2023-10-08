package gsLab;

import gsLab.Base.Nested;

class Base
	{
		 
		// Static method in base class which will be hidden in subclass 
	    public static void display() {
	        System.out.println("Static or class method from Base");
	    }
	      
	     // Non-static method which will be overridden in derived class 
	     public void print()  {
	         System.out.println("Non-static or Instance method from Base");
	    }
	     
	     static class Nested{
	    	 public void m1()
	    	 {
	    		 System.out.println("In Nested calss");
	    	 }
	     }
	}
	 class Derived extends Base
	{
		// This method hides display() in Base 
	    public static void display() {
	         System.out.println("Static or class method from Derived");
	    }
	      
	    // This method overrides print() in Base 
	    public void print() {
	         System.out.println("Non-static or Instance method from Derived");
	   }
	}
	public class StaticMethodExample {
	public static void main(String[] args) {
		Base obj = new Derived();
		Nested nested = new Base.Nested();
		nested.m1();
		obj.display();
		obj.print();

	}

}
