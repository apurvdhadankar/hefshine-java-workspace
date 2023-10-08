package test1;

public class Person{
	String PName;
	int AdhaarNo;
	String PJobName;
	int PJobId;
	String PJobLocation;
	
	Address a;
	
	
public Person(String pName, int adhaarNo, String pJobName, int pJobId, String pJobLocation, Address a) {
		super();
		PName = pName;
		AdhaarNo = adhaarNo;
		PJobName = pJobName;
		PJobId = pJobId;
		PJobLocation = pJobLocation;
		this.a = a;
	}













	public void displayPersonDetails()
	{
		System.out.println("Person [PName=" + PName + ", AdhaarNo=" + AdhaarNo + ", PJobName=" + PJobName + ", PJobId=" + PJobId
				+ ", PJobLocation=" + PJobLocation + ", a=" + a + "]");
	}
	
	
	
	


}
