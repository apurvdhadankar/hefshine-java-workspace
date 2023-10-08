package strings;

public class MarksTable {
	
	String sNmae;
	int java, c, python, angular;
	public MarksTable(String sNmae, int java, int c, int python, int angular) {
		super();
		this.sNmae = sNmae;
		this.java = java;
		this.c = c;
		this.python = python;
		this.angular = angular;
	}
	@Override
	public String toString() {
		return "\n MarksTable [sNmae=" + sNmae + ", java=" + java + ", c=" + c + ", python=" + python + ", angular="
				+ angular + "]";
	}
	
	

}
