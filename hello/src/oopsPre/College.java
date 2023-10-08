package oopsPre;

import java.nio.channels.NetworkChannel;

public class College {
	String name;
	int c_id;
	
	public College(String name, int c_id) {
		super();
		this.name = name;
		this.c_id = c_id;
		System.out.println(c_id+" "+name);
	}
	class Department
	{
		String name;
		int d_id;
		public Department(String name, int d_id) {
			super();
			this.name = name;
			this.d_id = d_id;
			System.out.println(d_id+" "+name);
		}
		
	}
	public static void main(String[] args) {
		College.Department d = new College("SSH", 007).new Department("UDMS", 9933);
		
		

	}

}
