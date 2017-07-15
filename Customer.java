
public class Customer {

	//variables
	private int ID;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	
	//default constructor
	public Customer(){
		
	}
	
	//non-default constructor
	public Customer(String fName, String lName, String address, String state, String zip){
		this.firstName = fName;
		this.lastName = lName;
		this.streetAddress = address;
		this.state = state;
		this.zipcode = zip;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String fname) {
		this.firstName = fname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lName) {
		this.lastName = lName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Customer [name=" + firstName + ", streetAddress=" + streetAddress + ", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + "]";
	}

	//Used in conjunction with the sort in the tester. Compares lexigraphically and if it less than the one it's compared to it is false so it stays where it's at
	//If last names are the same then it compares first names in the same fashion.
	public boolean compareTo(Customer customerList) {
		return (this.getLastName().toUpperCase().compareTo(customerList.getLastName().toUpperCase()) > 0
				|| (this.getLastName().toUpperCase().compareTo(customerList.getLastName().toUpperCase()) == 0
						&& this.getfirstName().toUpperCase().compareTo(customerList.getfirstName().toUpperCase()) > 0));

	}
}
