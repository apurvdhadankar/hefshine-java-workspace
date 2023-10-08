package com.hefshine.utility.HibernateAnnotation;
import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String fnmae, lname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String fnmae, String lname) {
		super();
		this.id = id;
		this.fnmae = fnmae;
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFnmae() {
		return fnmae;
	}
	public void setFnmae(String fnmae) {
		this.fnmae = fnmae;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
