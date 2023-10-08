package test1;

public class Address {

	
	
		int streetNo;
		String city;
		String state;
		String country;
		
		public Address(int streetNo, String city, String state, String country) {
			super();
			this.streetNo = streetNo;
			this.city = city;
			this.state = state;
			this.country = country;
		}
		public Address(Person person) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Address [streetNo=" + streetNo + ", city=" + city + ", state=" + state + ", country=" + country
					+ "]";
		}
		
		
		

	

}
